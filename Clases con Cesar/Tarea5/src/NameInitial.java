import java.util.Scanner;

public class NameInitial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String name = scn.nextLine();

        String iniciales = "";

        for (int i = 0; i < name.length(); i++) {
            if (i == 0 ){
                iniciales += name.charAt(i);
            }
            if ((name.charAt(i) == ' ') && (i < name.length()-1)) {
                iniciales += name.charAt(i+1);
            }
        }
        System.out.println(iniciales);
    }
}
