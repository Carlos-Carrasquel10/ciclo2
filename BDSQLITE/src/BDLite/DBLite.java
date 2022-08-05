
package BDLite;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class DBLite {
    
    public static void main(String[] args) {
        
        try {
        Conexion cnx = new Conexion();
        
        Connection cn = cnx.conectar();
        
        //sentencias preparadas
        PreparedStatement ps = cn.prepareStatement("INSERT INTO mascotas VALUES(?,?,?,?);");
        //enviamos literal de informacion a la base de datos
        ps.setInt(1, 10);
        ps.setString(2, "Laskmy");
        ps.setString(3, "Satfford shire bullterrier");
        ps.setString(4, "Negro");
        
        ps.executeUpdate(); //ejecutamos
            
        } catch (SQLException ex) {
            
            Logger.getLogger(DBLite.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
}
