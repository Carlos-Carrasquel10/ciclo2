package Metodo;
public class Persona {
    //atributos
    String nombre;
    int edad;
    
    //metodo constructor

    public Persona(String nombre, int edad) {
        this.nombre = nombre; 
        this.edad = edad;
    }
    
    public void mostrarDatos(){
    
        System.out.println("El nombre es: "+nombre);
        System.out.println("El edad es: "+edad);
    }
    
}
