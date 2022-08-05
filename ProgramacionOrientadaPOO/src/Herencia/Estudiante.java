
package Herencia;


public class Estudiante extends Persona{ //estudiante es hijo de persona
    
    private int codigoEstudiante;
    private float notaFinal;

    //con el extends reutilizamos variables de la clase padre
    public Estudiante( String nombre, String apellido, int edad ,int codigoEstudiante, float notaFinal) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos(){
        System.out.println("-------ESTUDIANTE----------");
        System.out.println("El nombre es: "+getNombre()); //utilizamos la variable privada con getter
        System.out.println("El apellido es: "+getApellido()); //utilizamos la variable privada con getter
        System.out.println("La edad es: "+getEdad()); //utilizamos la variable privada con getter
        System.out.println("La codigo del estudiante es: "+codigoEstudiante); 
        System.out.println("La nota del estudiante es: "+notaFinal); 
        System.out.println("_____________________________");
        
    }
    
}
