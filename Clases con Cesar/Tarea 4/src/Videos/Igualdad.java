package Videos;

import java.util.Date;

public class Igualdad {
    public static void main(String[] args) {
        //Ejemplo 1
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");

        System.out.println(one == two);             //false
        System.out.println(one == three);           //true
        System.out.println(one.equals(two));        //false, StringBuilder no implementa equals

        //Ejemplo 2
        Object t1 = new Object();
        Object t2 = new Object();
        Object t3 = t1;
        Date d1 = new Date();
        String str = "";
        System.out.println(t1 == t3);
        System.out.println(t1 == t2);
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(str));
        //System.out.println(d1 == str);          //no compila, tipos de datos incompatibles

    }
}
