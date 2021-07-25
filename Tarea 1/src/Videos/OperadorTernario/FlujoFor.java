package Videos.OperadorTernario;

public class FlujoFor {
    public static void main(String[] args) {
        //for(;;); //Ciclo infinito
        /*for(;;)                     //Ciclo infinito
            System.out.println("Dentro del for");

         */

        int x=1;
        int z=1;
        //for (int x=0;i<10:i++)                  //No xompila, la variable i ya esta declarada
            System.out.println("Dentro del for");

        for (int i = 0; i < 10; i++) { } //Ciclo vacio

        for (int i = 0; i < 10; i++) ;      //Ciclo vacio

        for (int i = 0; i < 10; i++)
            System.out.println("Dentro del for");
            //System.out.println(i); //No compila, no pertenece al for

        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                for (int k = 0; k < 10; k++)
                    System.out.println(i+j+k);

        int nn=0;
        int mm=0;
        int hk=0;
        for (System.out.println(mm++),returnAnInt(), mm=1;mm<10; System.out.println(mm++), returnAnInt(), hk = returnAnInt(),nn+=mm){
            System.out.println(hk);
        }


    }

    private static int returnAnInt() {
        return 1;
    }

}

