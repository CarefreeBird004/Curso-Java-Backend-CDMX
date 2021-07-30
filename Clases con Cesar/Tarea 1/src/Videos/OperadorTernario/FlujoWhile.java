package Videos.OperadorTernario;

public class FlujoWhile {
    public static void main(String[] args) {
        //No es posible "Hardcodear" un valor false, error de compilacion por "Unreacheable code" aun y cuando el while esta vacio

        final boolean EXP_False = false;
        boolean exp_false = false;

        //while(EXP_FALSE){}        //nO COMPILA. Unreacheable code.
        //while(false){}            //No compila. Unreacheable code.

        while(exp_false){}          //Compila. El valor de la variable no puede ser determibada en tiempo de compilacion

        //La estructura while puede estar vacia

        boolean expresion = false;

        while(expresion){}          //While vacio
        while (expresion);          //while vacio

        //cilcos infinitos
        int x=0;
        int y=0;
        //while (x<10)                //Loop infinito
            System.out.println(x);
            x++;                    //Esta variable esta fuera del ciclo


        while (y<10){               //Loop reguñar, esta seria la manera correcta de agrupar las operaciones
            System.out.println(y);
            y++;
        }

        //Utilizando operaciones unarios en condiciones
        int z=1;
        while(z++>1){
            z--;
        }
        System.out.println("Z: "+z);    //Z:2




    }
}
