package com.training;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PruebaTemporizadorConClaseInterna {

    public static void main(String[] args){
        /*
        Inner class o clase interna
Es una clase dentro de otra.

Objetivos , utilidad , motivos
Para que se necesitan?
• Para acceder a los campos privados de una clase desde otra clase.
• Para ocultar una clase de otras pertenecientes al mismo paquete.
• Para crear clases internas "anónimas", muy útiles para gestionar eventos y retrollamadas
• Cuando solo una clase debe acceder a los campos de ejemplar de otra clase.


Clases Internas locales ¿Qué son?
• Una clase dentro de un método.
• ¿Cuándo se utilizan estos tipos de clases y por qué?
• Son útiles cuando solo se va a utilizar (instanciar) la clase interna una vez. El objetivo es
simplificar aún más el código.
• Su ámbito queda restringido al método donde son declaradas. ¿Ventajas?
• Están muy "encapsuladas". Ni siquiera la clase a la que pertenecen puede acceder
a ella. Tan solo puede acceder a ella el método donde están declaradas.
• El código resulta más simple.
         */


        Reloj mireloj= new Reloj(3000, true);
        mireloj.enMarcha();
        JOptionPane.showMessageDialog(null,"Pulsa aceptar para terminar");
        System.exit(0);
    }
}

