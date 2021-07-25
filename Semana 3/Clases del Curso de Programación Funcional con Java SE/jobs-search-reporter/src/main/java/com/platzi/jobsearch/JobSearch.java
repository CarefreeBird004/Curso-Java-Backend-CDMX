package com.platzi.jobsearch;

import com.beust.jcommander.JCommander;
import com.platzi.jobsearch.api.*;
import com.platzi.jobsearch.cli.*;

import java.util.*;
import java.util.stream.Stream;

import static com.platzi.jobsearch.CommanderFunctions.buildCommanderWithName;
import static com.platzi.jobsearch.CommanderFunctions.parseArguments;
import static com.platzi.jobsearch.api.APIFunctions.buildAPI;

public class JobSearch {

    public static void main(String[] args) {
        //Creación de nuestro CLI con JCommander
        JCommander jCommander = buildCommanderWithName("job-search", CLIArguments::newInstance);

        //Obtenemos las opciones que se le dieron a JCommander
        Stream<CLIArguments> streamOfCLI =
                //Nos retorna un Optional<List<Object>>
                parseArguments(jCommander, args, JCommander::usage)
                        //En caso de un Optional.empty()
                        .orElse(Collections.emptyList())
                        .stream()
                        .map(obj -> (CLIArguments) obj);

        //Tomamos nuestro Stream y obtenemos las opciones que se dieron en el CLI
        Optional<CLIArguments> cliOptional = streamOfCLI
                //Solo nos interesan los casos donde no sea la solicitud de ayuda
                .filter(cli -> !cli.isHelp())
                //Y que contengan un keyword, en otros caso no tenemos que buscar
                .filter(cli -> cli.getKeyword() != null)
                .findFirst();

        //Si el Optional tiene un dato, lo convertimos a Map<String,Object>
        cliOptional.map(CLIFunctions::toMap)
                //Convertimos el Map en un request
                .map(JobSearch::executeRequest)
                //Aun seguimos operando sobre un Optional… en caso de que no hubiera datos
                //Generamos un stream vacío
                .orElse(Stream.empty())
                //Imprime los datos por pantalla.
                .forEach(System.out::println);
    }

    private static Stream<JobPosition> executeRequest(Map<String, Object> options) {
        JobsAPI api = buildAPI(JobsAPI.class, "https://jobs.github.com");

        return Stream.of(options)
                .map(api::jobs)
                .flatMap(Collection::stream);
    }
}