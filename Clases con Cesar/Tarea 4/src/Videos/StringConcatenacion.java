
package Videos;

import java.lang.ref.SoftReference;
import java.time.LocalDate;

public class StringConcatenacion {
    public static void main(String[] args){
        //Ejemplo 1 - Aplicacion de todas las reglas
        int tres = 3;
        String cuatro = "4";
        System.out.println(1 + 2 +tres + cuatro);

        //Ejemplo 2 +=
        String s = "1";
        s += "2";

        s += 3;
        System.out.println(s);

        //Ejemplo 3
        String a = null;
        System.out.println(a + 3);
        System.out.println(String.valueOf(a) + String.valueOf(3));

        //Ejemplo 4
        //System.out.println(null);         //No compila, es ambiguo cual sobrecarga elegir
        String str = null;
        System.out.println(str);            //Imprime null

        //Ejemplo 5
        Object obj = new Object();
        LocalDate ld = LocalDate.now();
        System.out.println("" + obj + ld);
        //System.out.println(obj + ld);               //No compila, no se puede utilizar el operador de + de esta manera

    }
}
