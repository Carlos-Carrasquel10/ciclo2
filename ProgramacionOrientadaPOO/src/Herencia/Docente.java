
package Herencia;


public class Docente extends Persona{
    
    private int codigoDocente;
    private float sueldo;

    public Docente(String nombre, String apellido, int edad, int codigoDocente, float sueldo) {
        super(nombre, apellido, edad);
        this.codigoDocente = codigoDocente;
        this.sueldo = sueldo;
    }
    
    public void mostrarDatos(){
        System.out.println("-------DOCENTE----------");
        System.out.println("El nombre es: "+getNombre()); //utilizamos la variable privada con getter
        System.out.println("El apellido es: "+getApellido()); //utilizamos la variable privada con getter
        System.out.println("La edad es: "+getEdad()); //utilizamos la variable privada con getter
        System.out.println("La codigo del docente es: "+codigoDocente); 
        System.out.println("La sueldo del docente es: "+sueldo); 
        System.out.println("_____________________________");
        
    }
    
}
