
package Equipo;


public class Doctor extends Persona{
    private String titulacion;
    private int añoExp;

    public Doctor( String nombre, String apellido, int edad, String titulacion, int añoExp) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.añoExp = añoExp;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAñoExp() {
        return añoExp;
    }
    
     @Override
    public void partidoFutbol() {

        System.out.println("Doctor asiste partido");
    }

    @Override
    public void entrenamiento() {

        System.out.println("Doctor da asistencia medica");
    }
    
   
    public static void curarLesion() {

        System.out.println("Doctor asiste lesiones");
    }
    
    
}
