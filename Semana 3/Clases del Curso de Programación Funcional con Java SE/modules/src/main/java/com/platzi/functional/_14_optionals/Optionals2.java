package com.platzi.functional._14_optionals;


import com.sun.rowset.providers.RIOptimisticProvider;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Optionals2 {

    public static void main(String[] args) {
        List<String> names = getNames();
        if (names!= null){
            //Operrar con nombres

        }
        Optional<List<String>> optionalNames = getOptionalName();
        if(optionalNames.isPresent()){

        }

        optionalNames.ifPresent(namesValue -> namesValue.forEach(System.out::println));

        Optional<String> valuablePlayer = optionalValuealePlayer();
        String valuablePlayerNmae = valuablePlayer.orElseGet(()->"No player");
    }


    static List<String> getNames(){
        List<String> list = new LinkedList<>();
        return Collections.emptyList();
    }

    static String mostValueablePlayer(){
        return null;

    }
    static int mostExpensiveItems(){
        return -1;
    }
    static Optional<List<String>> getOptionalName(){
        List<String > nameList = new LinkedList<>();
        //Obtencion de nombres
        return Optional.of(nameList);
    }
    static Optional<String> optionalValuealePlayer(){
        //
     //   return Optional.ofNullable();
        try{
            //Accesos
        }catch (Exception e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

}
