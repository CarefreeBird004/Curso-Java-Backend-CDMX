package Videos;

public class StringBuilderExample {
    public static void main(String[] args) {
        //Ejemplo 1 -String
        System.out.println("1-----------------------------");
        String test = "";
        for (char current='a';current<='z';current++){
            test+=current;                              //En cada iteración se crea un nuevo String en memoria e inmediatamente en la siguiente
                                                        //iteración se valor es reemplazado y es elegido para ser gc.
        }
        System.out.println(test);               //imprime "abc....z"


        //Ejemplo 2 - StringBuilder
        System.out.println("2----------------------------");
        StringBuilder testSb= new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++){
            testSb.append(current);                     //En cada iteración se modifica el mismo objeto creado antes del ciclo for.

        }
        System.out.println(testSb);

        //Ejemplo 3 - Creación StringBuilder
        System.out.println("3----------------------------");
        StringBuilder sb1 = new StringBuilder();                //Crear un StringBuilder con una cadena vacia
        StringBuilder sb2 = new StringBuilder(sb1);             //Crear un String Builder a partir de otro StringBuilder
        StringBuilder sb3 = new StringBuilder(10);      //Crear un StringBuilder con una capacidad inicial de 10. El default es 16.
        StringBuilder sb4 = new StringBuilder("");             //Crear un StringBuilder a partir de un String


        //Ejemplo 4 - Mutabilidad y encadenamiento
        System.out.println("4----------------------------");
        StringBuilder sb = new StringBuilder("Inicio");
        sb.append("+mitad");
        StringBuilder same = sb.append("+fin");
        System.out.println(sb == same);                     //true
        sb.append("+1");
        System.out.println(same);

        same.append("+2").append("+3");                     //Es posible encadenar las llamadas a los métodos puestos que append
        System.out.println(sb);

        //Ejemplo 5 - StringBuilder no implementa el método equals a diferencia de String
        System.out.println("5------------------------------");
        StringBuilder sba = new StringBuilder("Hola");
        StringBuilder sbb = new StringBuilder("Hola");
        System.out.println(sba == sbb);                             //false
        System.out.println(sba.equals(sbb));                        //false
        System.out.println(sba.toString().equals(sbb.toString()));  //true

        //Ejemplo 6 - Diferencia entre capacidad y tamaño
        System.out.println("6-------------------------------");
        StringBuilder strB = new StringBuilder(5);          //Crea un StringBuilder con una capacidad inicial 10.
        StringBuilder strBDefault = new StringBuilder();            //Default capacity 16.
        System.out.println(strB.capacity());                        //5
        System.out.println(strBDefault);                            //16
        System.out.println(strB.length());                          //0
        strB.append("123456");                                      //Se agregan 6 caracteres al SB
        System.out.println(strB.capacity());                        //12 La capacidad se incrementa automáticamente conforme conforme se vaya necesitando
                                                                    //   Para el examen no es necesario saber como ni en cuanto se incrementa
        System.out.println(strB.length());                          //6


    }
}
