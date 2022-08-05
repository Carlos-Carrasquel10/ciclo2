package Equipo;

public class Entrenador extends Persona {

    private String estrategia;

    public Entrenador(String nombre, String apellido, int edad, String estrategia) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }

    @Override
    public void partidoFutbol() {

        System.out.println("Entrenador dirige partido");
    }

    @Override
    public void entrenamiento() {

        System.out.println("Entrenador dirige entrenamiento");
    }

    public void planificarEntrenamiento() {

        System.out.println("El entrenador planifica el entrenamiento");
    }

}
