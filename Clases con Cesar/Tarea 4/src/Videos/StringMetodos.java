package Videos;

import java.util.Locale;
import java.util.SortedMap;

public class StringMetodos {
    public static void main(String[] args) {
        //Ejemplo 1 -length()
        System.out.println("animals".length());

        //Ejemplo 2 - charAt()
        //String test1 = "01234".charAt(0);       //No compila, el valor regresado es un char
        char test = "01234".charAt(0);
        int testInt = "01234".charAt(0);        //El char puede ser asignado a un valor numerico como int, byte, float, double, etc
        System.out.println("test: " + test);
        System.out.println("testInt: " + testInt);

        //Ejemplo 3 - indexOf()
        System.out.println("".indexOf("StringNotFound"));       //-1. El string no fue encontrado
        System.out.println("".indexOf("StringNotFound", 999));// -1. Aun y cuando el index no existe, no lanza una excepción
        //System.out.println("".indexOf(null));                   //Lanza un NUllPointerException

        //Ejemplo 4 - substring
        System.out.println("01234".substring(0,0));             //String vacío
        System.out.println("01234".substring(0,1));             //0
        //System.out.println("01234".substring(1,0));             //Lanza StringIndexOutOfBoundException
        System.out.println("01234".substring(0,5));             //01234

        //Ejemplo 5 - toUpperCase() / toLowerCase
        System.out.println("abCaBc".toUpperCase());             //ABCABC
        System.out.println("abCaBc".toLowerCase());             //abcabc
        System.out.println("123".toUpperCase());                //123

        //Ejemplo 6
        String a1 = "abc";
        String a2 = new String("abc");
        String a3 = "ABC";
        System.out.println(a1.equals(a2));                      //true
        System.out.println(a2.equals(a3));                      //FALSE. Hace distincion entre mayusculas y minisculas
        System.out.println(a3.equalsIgnoreCase(a2));             //true

        //Ejemplo 7 startsWith / endsWith
        System.out.println("abc".startsWith("a"));              //true
        System.out.println("abc".startsWith("A"));              //false. Hace distinción entre mayusculas y minisculas
        System.out.println("abc".endsWith("c"));                //true
        System.out.println("abc".endsWith("a"));                //false. Termina c, no con a
        System.out.println("abc".endsWith("abc"));              //true
        System.out.println("".endsWith(""));                    //true
        System.out.println("".startsWith(""));                  //true

        //Ejemplo 8 - contains
        System.out.println("abc".contains("a"));                //true
        System.out.println("abc".contains("A"));                //false. Hace distinción entre mayusculas y minusculas
        System.out.println("abc".contains("bc"));               //true
        System.out.println("".contains(""));                    //true

        //Ejemplo 9 replace
        System.out.println("abc".replace("a", "A"));           //Abc
        //System.out.println("abc".replace("a",'A'));             //No compila, cuanso se utiliza un char ambos deben ser char
        System.out.println("abc".replace("a",new StringBuilder("A")));   //Abc
        System.out.println("abc".replace("d", "a"));            //abc. No remplaza nada
        System.out.println("".replace("","123"));               //123
        String testA = new String("abc");
        System.out.println("No lo encontro: " + (testA == testA.replace('1','2')));     //true
        System.out.println("No lo encontro: " + (testA == testA.replace("1","2")));     //true

        //Ejemplo 10 - trim
        System.out.println("   abc   ".trim());                 //abc
        System.out.println("\t\n   abc  \t\r\n".trim());        //abc
        System.out.println("\t\n a\t b c   \t\r\t   ".trim());      //a  b c

    }
}
