package Videos.OperadorTernario;

import java.time.DayOfWeek;

public class FlujoSwitch {
    public static void main(String[] args) {
        int x=0;
        switch (x){
            default:
                System.out.println("Case default");
                break;
            /*case "":                              No compila, no es del mismo tipo de dato que x
                System.out.println("Case vacio");
                break;

             */
            case 1:
                System.out.println("Caso 1");
                break;
        }
        final int y = 1;
        final int b = 2;
        final Integer n =3;
        long m = 4;
        int z = 0;
        switch (20){
        //switch(m){
        //switch(z){

            default:
                System.out.println("Case default");
                break;

            case 1:
                System.out.println("Case 1");
                break;
            //case y://Tener cuidado, ya que se duplica el mismo caso 1
              //  System.out.println("Case y =1");
               // break;
            case b:
                System.out.println("Caso 0");
                break;
        }

        //Enums
        DayOfWeek day = DayOfWeek.of(1);

        switch (day){
            case MONDAY:
                System.out.println("Monday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday");
                break;

            /*case DayOfWeek.THURSDAY:              No compila, switch identifica el tipo y el qualifier DayOfWeek
                System.out.println("Thursday");
                break;

             */
        }

        //String
        String cadena = "abc";
        final String MX = "MX";

        switch (cadena){
            case MX:
                System.out.println("MX");
                int b1=2;

                break;
            case "a":
                System.out.println("Monday");
                b1=1;
                int z1;
                break;
            default:

                break;
        }

        switch (x){}//Switch vacio
        switch (x){ //Switch multiple
            case 1:
            case 2:
            case 3:
                System.out.println("Case1: Case2");
        }
        byte some = 10;
        switch (some){
            case 127:
                System.out.println("10");
                break;
            case 'A':
                System.out.println("A");
                break;
            case 'z':
                System.out.println("z");
                break;
            /*case 65:
                System.out.println("65");
                break;

             */
        }


    }
}
