package Videos.MetodoEquals;

import java.util.Date;

public class Igualdad {
    public static void main(String[] args) {
        //Ejemplo1
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");

        System.out.println(one == two);         //False
        System.out.println(one == three);       //true
        System.out.println(one.equals(two));    //false. StringBuilder no implementa equals, sigue revisando la referecnia no el contenido

        //Ejemplo 2
        Object t1 =new Object();
        Object t2 =new Object();
        Object t3 =t1;
        Date d1 = new Date();
        String str = " ";
        System.out.println(t1==t3);             //false
        System.out.println(t1==t2);             //false
        System.out.println(t1.equals(t2));      //false
        System.out.println(d1.equals(str));      //false
        //System.out.println(d1==str);                //No compila, tipos de formatos diferentes


    }
}
