package pkg;

import java.sql.*;

/**
 *
 * @author jose.toledo.gonzalez
 */
public class Conexion {
    public Connection get_connection(){
        Connection conection =null;
        try{
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");

        }catch(SQLException e){
            System.out.println("Conexion fallo");
            System.out.println(e);
        }
        return conection;
    }
}