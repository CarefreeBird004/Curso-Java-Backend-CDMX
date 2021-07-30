package Videos.OperadorLogicoIgual;

public class EjerciciosRepaso {
    public static void main(String[] args) {
        int value1 = 2;
        int value2 = 3;
        int value3 = 0;

        int result1 = value1 + value2 * value1/2 %5;
        System.out.println("Result: "+result1); //Salida 5

        int result2 = (value1 + value2) * value1 / 2 %5;
        System.out.println("Result: "+result2); //Salida 0

        //int result3 = value1 * value2 / value3 +1;
        //System.out.println("Result: "+result3); //Salida ERROR division entre 0, se agrega un ArithmeticException
        try{

        }catch (ArithmeticException e){

        }
        //---------PromocionNumerica
        char ch = 'a';
        byte by = 1;
        short sh = 2;
        int in = 4;
        long lo = 3;
        float fl = 1.5f;
        double dob = 2.5;
        float fl2 = 1.0f;

        //char result11 = ch+1;       //No se puede realizar la operacion, porq
        //short result22= sh*2;       //No se puede
        //short result33 = ch + sh;   //No se puede
        //float result4 = sh * 2.0;   //No se puede porque le hace falta f
        double result5 = fl + fl;   //Si, porque cabe en un double
        long result6 = ch +1;       //Si, porque el tipo de dato es mas pequeño y entra en long
        //short result7 = (short)  in +1; //No, porque solo se hace el cast de in
        byte result8 = by;              //Si, porque es el mismo tipo de dato
        //byte result9 = (short) lo + (short) fl; // No, porque el tipo de dato es menor a short y no se puede
        int result10 = in *2;           //Si, porque entra dentro del tipo de dato
        short result111 = 2*2;          // Si, porque la multiplicacion entra en el rango de la multiplicacion de las literales
        short result12 = (short) (2*in);//Si porque hace el casteo como tanto a la variable y a la literal
        //short result12 = short (2*lo);  //No porque el casteo esta mal indicado
        sh++;                           //Si, porque el incremento esta dentro de los limites del tipo de dato
        by++;                           //Si, porque el incremento esta dentro de los limites del tipo de dato
        short result13= sh++;           //Si, porque el incremeto y asignacion estan dentro del tamaño del tipo de dato


    }

}
