//Una simple clase genérica.
//Aquí, T es un parámetro de tipo que será reemplazado por un tipo real
//cuando se crea un objeto de tipo Gen.

class Gen<T>{
    //T es el parámetro de tipo genérico.
    T ob; //Declara un objeto de tipo T

    //Pase al constructor una referencia a un objeto de tipo T.
    Gen(T o){
        ob=o;
    }

    T getOb(){
        return ob;
    }

    //Muestra el tipo de T
    void mostrarTipo(){
        System.out.println("El tipo de T es: "+ob.getClass().getName());
    }
}

//Demostración de clase genérica
class Generics {
    public static void main(String[] args) {

        //Crea una referencia Gen para Integers.
        Gen<Double> iOb;

        //Cree un objeto Gen<Integer> y asigne su referencia a iOb.
        //Observe el uso de autoboxing para encapsular el valor 28 dentro de un objeto Integer.
        iOb=new Gen<Double>(28.0);

        //Muestra el tipo de dato utilizado por iOb
        iOb.mostrarTipo();

        //Obtenga el valor en iOb.
        //Fíjese que no se necesita una conversión
        double v=iOb.getOb();
        System.out.println("Valor: "+v);
        System.out.println();

        //Cree un objeto Gen para Strings.
        Gen<String> strOb=new Gen<String>("Prueba de genéricos");

        //Muestra el tipo de dato utilizado por strOb
        strOb.mostrarTipo();

        //Obtenga el valor de strOb.
        // De nuevo, note que no se necesita de conversión
        String str=strOb.getOb();
        System.out.println("Valor: "+str);
    }
}