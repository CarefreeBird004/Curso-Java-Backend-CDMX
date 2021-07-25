package Videos.MetodoEquals;

import javax.jws.soap.SOAPBinding;
import java.time.LocalDate;

public class StringConcatenacion {
    public static void main(String[] args) {
        //Ejemplo 1
        int tres = 3;
        String cuatro ="4";
        System.out.println(1+cuatro+(2+tres)+tres); //1433

        //Ejemplo 2
        String s = null;
        s += "1";
        s += null;
        System.out.println(s);                      //null1null

        //Ejemplo 3
        String a = null;
        System.out.println(a + 5);                  //null5

        //Ejemplo 4
        //System.out.println(null);                   //Error

        //Ejemplo 5
        Object obj = new Object();
        LocalDate ld = LocalDate.now();
        System.out.println(""+obj+ld);              //toString() de cada objeto


        //Ejemplo 6
        Object obj1 = new Object();
        LocalDate ld1 = LocalDate.now();
        //System.out.println(obj1+ld1+"");            //No compila

        //Eejmplo 7
        System.out.println(null + " ");             //null
    }
}
