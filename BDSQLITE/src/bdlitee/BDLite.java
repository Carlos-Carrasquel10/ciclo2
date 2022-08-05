package bdlitee;

import java.util.logging.Level; //para logiarnos 
import java.util.logging.Logger; //problemas de conexion
import java.sql.*;
import java.util.Scanner;

public class BDLite {

    static int opcion;
    static Scanner entrada = new Scanner(System.in).useDelimiter("\n"); //delimitar el uso del scanner 

    public static void main(String[] args) {

        menu();

    }

    public static void menu() {

        do {
            System.out.println("**************************");
            System.out.println("Menu");
            System.out.println("1. Listar");
            System.out.println("2. Guardar");
            System.out.println("3. Eliminar");
            System.out.println("4. Editar");
            System.out.println("5. Salir");

            System.out.println("");
            System.out.println("Ingrese una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    listar();
                    break;
                case 2:
                    guardar();
                    break;
                case 3:
                    eliminar();
                    break;
                case 4:
                    editar();
                    break;

            }

        } while (opcion != 5);
    }

    public static void guardar() {
        try {
            Conexion cnx = new Conexion();
            Connection cn = cnx.conectar();
            //sentencias preparadas 
            PreparedStatement ps = cn.prepareStatement("INSERT INTO mascotas VALUES(?,?,?,?);"); //de decimos los campos que hay en la tabla 

            System.out.println("Ingrese el codigo: ");
            int codigo = entrada.nextInt();

            System.out.println("Ingrese el nombre: ");
            String nombre = entrada.nextLine();

            System.out.println("Ingrese la raza: ");
            String raza = entrada.nextLine();

            System.out.println("Ingrese la color: ");
            String color = entrada.nextLine();

            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setString(3, raza);
            ps.setString(4, color);

            ps.executeUpdate();

        } catch (SQLException ex) {

            Logger.getLogger(BDLite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void eliminar() {
        try {
            Conexion cnx = new Conexion();
            Connection cn = cnx.conectar();
            //sentencias preparadas 
            PreparedStatement ps = cn.prepareStatement("DELETE FROM mascotas WHRERE codigo = ?; ");//de decimos los campos que hay en la tabla 

            System.out.println("Ingrese el codigo de la moscota a eliminar: ");
            int codigo = entrada.nextInt();
            ps.setInt(1, codigo);

            ps.executeUpdate();

        } catch (SQLException ex) {

            Logger.getLogger(BDLite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void editar() {
        try {
            Conexion cnx = new Conexion();
            Connection cn = cnx.conectar();
            //sentencias preparadas 
            PreparedStatement ps = cn.prepareStatement("UPDATE mascotas SET nombre = ?, raza = ?, color = ? HERE codigo = ?; ");//de decimos los campos que hay en la tabla 

            System.out.println("Ingrese el codigo de la moscota a editar: ");
            int codigo = entrada.nextInt();

            System.out.println("Ingrese el nuevo nombre: ");
            String nombre = entrada.nextLine();

            System.out.println("Ingrese la nueva raza: ");
            String raza = entrada.nextLine();

            System.out.println("Ingrese el nuevo color: ");
            String color = entrada.nextLine();

            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setString(3, raza);
            ps.setString(4, color);

            ps.executeUpdate();

        } catch (SQLException ex) {

            Logger.getLogger(BDLite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void listar() {
        try {
            Conexion cnx = new Conexion();
            Connection cn = cnx.conectar();
            //sentencias 
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM mascotas;");

            while (rs.next()) {

                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));

            }

        } catch (SQLException ex) {

            Logger.getLogger(BDLite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
