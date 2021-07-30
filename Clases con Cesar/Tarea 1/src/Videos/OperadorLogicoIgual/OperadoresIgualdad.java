package Tarea1.Videos;

import javax.management.StandardEmitterMBean;
import javax.swing.*;
import java.io.File;
import java.util.Date;

public class OperadoresIgualdad {
    public static void main(String[] args) {
        boolean a = 5==5.0;
        // boolean x= true==3; no compila porque no se puede
        // boolean y= false != "Giraffe"; NO COMPILA
        // boolean z= 3== "Kangaroo"; NO COMPILA

        boolean test = null == null; // Ejemplo valido

        // if (w4 =1) {} NO COMPILA, NO SE ESTA COMPARANDO, SE ESTA ASIGNANDO

        boolean y= false;
        boolean x = (y=true);
        System.out.println(x); // Salida true

        File x2 = new File("miFile.txt");
        File y2 = new File("miFile.txt");
        File z= x2;
        System.out.println(x2==y2); //Salida false
        System.out.println(x2==z); //Salida true

        if (new Integer(5)== new Object()){ }
        //if (new Integer(5)== new Date()){ } NO COMPILA
    }
}
