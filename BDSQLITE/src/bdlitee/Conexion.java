package bdlitee;
import static java.lang.Character.UnicodeBlock.forName;
import java.sql.*;
public class Conexion {
    
    Connection conectar = null;
    
    public Connection  conectar(){
        try {
             Class.forName("org.sqlite.JDBC");
             conectar = DriverManager.getConnection("jdbc:sqlite:Tiendamascotas.db");
             
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
        return conectar;
    
    }
    
}

