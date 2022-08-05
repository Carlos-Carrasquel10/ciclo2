
package sistema.empleadosDAL;

import java.sql.*; //importamos todas las librerias de SQL
public class conexion {
    
    String strConexionDB = "jdbc:sqlite:C:/Users/Carlos/Documents/NetBeansProjects/SISTEMA/SISTEMA.db";
    
    Connection con = null;

    public conexion() {
        
        try {
            
            Class.forName("org.sqlite.JDBC"); //A QUE BASE DE DATOS NOS VAMOS A CONECTAR
            con = DriverManager.getConnection(strConexionDB);
            
            System.out.println("Conexion establecida");
            
        } catch (Exception e) {
            
            System.out.println("Error de conexcion"+e);
        }
        
    }
    
    public int ejecutarSentenciaSQL(String strSentenciaSQL){
        
        try {
            PreparedStatement ps = con.prepareStatement(strSentenciaSQL);
            ps.execute();
            return 1; 
            
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
    
    public ResultSet consultarRegistros(String strSentenciaSQL){
        
        try {
            PreparedStatement ps = con.prepareStatement(strSentenciaSQL);
            ResultSet respuesta = ps.executeQuery(); //ejecutamos el QUERY
            return respuesta; 
            
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
}
