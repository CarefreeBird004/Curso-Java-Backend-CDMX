package Videos.MetodoEquals;
import java.lang.*;
public class StringBuilderMetodos {

    public static void main(String[] args) {
        //Ejemplo 1- Metodos compartidos con la clase String
        System.out.println("1-------------------------");

        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));

        int len = sb.length();
        int ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);

        StringBuilder sb1 = new StringBuilder("hola");
        //String sub1 = sb.substring(0 , 4).append("mundo"); //No compila, el metodo substring regresa un String no un StringBuilder

        //Ejemplo 2 append()

        System.out.println("2----------------------------");
        StringBuilder sba = new StringBuilder("Hola").append("MunDo").append(1).append(true).append(new Object());
        System.out.println(sba);

        //Nota: El metodo printl manda llamar el internamente el metodo "String.valueOf(paramaetro)" el cual
        //      manda llamar el metodo toString() del metodo o retorna "null" si el objeto es null

        //Ejemplo 3 - insert()
        System.out.println("3------------------");
        StringBuilder sbb = new StringBuilder("Animals");
        sbb.insert(7, "-");         //sb= animals-
        sbb.insert(0, "-");         // sb= -animals-
        sbb.insert(4, "-");         //sb= -ani-mals-
        System.out.println(sbb);

        //4 ejemplo - delete()
        System.out.println("4---------------------");
        StringBuilder sbc = new StringBuilder("abcef");
        sbc.delete(1,3);
        //sbc.deleteCharArt(5);     //StringIndexOutOfBoundsException
        //sbc.delete(5,1);          //Lanza StringIndexOutOfBoundsException
        //sbc.delete(-1,1);          //Lanza StringIndexOutOfBoundsException

        sbc.delete(1,1);            //No elimina nada
        System.out.println(sbc);    //Elimina todo, No lanza StringOutOfBoundsException
        sbc.delete(0,5);            //" " String vacio


        //Ejemplo 5 - reverse
        System.out.println("5------------------");
        StringBuilder sbd = new StringBuilder("ABCD");
        sbd.reverse();
        System.out.println(sbd); //DCBA






    }

}
