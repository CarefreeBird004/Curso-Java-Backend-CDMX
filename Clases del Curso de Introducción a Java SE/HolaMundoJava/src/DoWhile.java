import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        int responce = 0;

        do{
            System.out.println("Selecciona el numero de la opción deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");
            Scanner sc =new Scanner(System.in);
            responce = Integer.valueOf(sc.nextLine());
            switch (responce){
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Selecciona una opción correcta");
            }
        }while (responce != 0);
        System.out.println("Se termino el programa");
    }
}
