package Videos.OperadorTernario;

public class OpereadorTernario {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        //boolean z = x==1 ? "true" : false; //No compila, distinto tipo de dato que retorna

        //x == 1 ? "true": false; // No compila

        boolean z = x==1?true :false; //Regrsan el mismo tipo de dato

        System.out.println(x == 1 ? x++ : " "); //Regresa distinto tipo de dato, pero println no tiene problemas

        int i = x==1 ? y++:x--;


        int j= x>0 ?x<10? 5:8 :-1;
        int j1= (x>0)?(x<10)?5:8:-1;

        int b= 0;
        int u = 0;
        int c= b==0?b++:u++;

        System.out.println("b: " + b + ", u: "+u+", c:"+c);
        int h=0;
        System.out.println(h>1 ? 1: "Hola");
        Object animal = h > 1 ? 1:"Hola";

    }
}
