
package Herencia;


public class Main {
    
    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante("Carlos","Carrasquel", 20 ,121 , 5.0f);
        Estudiante estudiante2 = new Estudiante("Julian","Castro", 20 , 122 , 4.0f);
        
        estudiante1.mostrarDatos();
        estudiante2.mostrarDatos();
        
        Docente docente1 = new Docente("Peinado", "quintero", 30, 123, 2.000f);
        Docente docente2 = new Docente("olivera", "espinosa", 41, 124, 3.000f);
        
        
        docente1.mostrarDatos();
        docente2.mostrarDatos();
        
    }
}
