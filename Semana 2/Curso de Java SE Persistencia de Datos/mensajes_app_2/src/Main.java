import pkg.*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author jose.toledo.gonzalez
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion=0;
        do {
            System.out.println("Alicacion de mensajes");
            System.out.println("1. Crear mensaje");
            System.out.println("2. Listar mensaje");
            System.out.println("3. Editar mensajes");
            System.out.println("4. Eliminar mensaje");
            System.out.println("5. Salir");

            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    MensajesService.crearMensajes();
                    break;
                case 2:
                    MensajesService.listarMensajes();
                    break;
                case 3:
                    MensajesService.editarMensajes();
                    break;
                case 4:
                    MensajesService.borrarMensaje();
                    break;
                default:
                    break;
            }

        }while(opcion!=5);

    }
}