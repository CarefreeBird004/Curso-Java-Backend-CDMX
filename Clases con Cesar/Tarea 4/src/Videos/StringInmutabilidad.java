package Videos;

import java.util.Locale;

public class StringInmutabilidad {
    public static void main(String[] args) {
        //Ejemplo 1
        String str1 =  "   123   ";
        str1 = str1.trim();                         //Devuelve ptrp objeto que contiene "123"
        System.out.println(str1);

        //Ejemplo 2
        String a = "Hola";
        String b = "Mundo";
        a.concat(b);
        System.out.println(a);

        //Ejemplo 3
        String a1 = "Hola";
        a1.substring(2).concat("123").toUpperCase();    // No se esta guardando la referencia por estas operaciones
        System.out.println(a1);                         //Hola
    }
}