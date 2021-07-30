package Videos.OperadorTernario;

public class FlujoDoWhile {
    public static void main(String[] args) {
        int x1=1;
        do
            System.out.println(x1);
        while(x1>10);

        do System.out.println(x1);while (x1>10);

        do {
            System.out.println(x1);
        }while (x1>10);

        do
            //System.out.println(x1); //No compila
            System.out.println(x1);
        while(x1>10);

        do {
            System.out.println(x1);
            System.out.println(x1);
        }while (x1>10);
        do {
            System.out.println(x1);
        }while (false);


        do{
            System.out.println(x1);
        }while (true);
    }
}
