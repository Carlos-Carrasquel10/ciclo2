package Equipo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in); //pedir datos por consola
    static ArrayList<Persona> persona = new ArrayList<Persona>(); //crear un arreglo (vector tiene unas posiciones) cada objeto lo metemos en un vector

    static Persona futbolista1 = new Futbolista("german", "Londoño", 18, 10, "delantero");
    static Persona futbolista2 = new Futbolista("Carlos", "Carrasquel", 20, 1, "arquero");

    static Entrenador entrenador1 = new Entrenador("luis", "angel", 40, "defensiva");

    static Doctor doctor1 = new Doctor("Alexi", "Lopez", 50, "fisioTeraupeta", 30);

    public static void main(String[] args) {

        //le asignamos los datos al array
        persona.add(futbolista1);
        persona.add(futbolista2);
        persona.add(entrenador1);
        persona.add(doctor1);
        menu();
    }

    public static void menu() {

        int opcion;

        do {
            System.out.println("\t.: MENU:.");
            System.out.println("1. Viaje de equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de futbol");
            System.out.println("4. Planificar entrenamiento");
            System.out.println("5. Dar entrevista");
            System.out.println("6. Curar lesion");
            System.out.println("7. Salir");
            System.out.println("Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("");
                    viajeEquipo(); //viaje de equipo
                    break;

                case 2:
                    System.out.println("");
                    entrenamientoEquipo(); //entrenamiento
                    break;

                case 3:
                    System.out.println("");
                    partidoFutbolEquipo(); //partido de futbol
                    break;

                case 4:
                    System.out.println("");
                    planificarEntrenamientoEquipo(); //planificar entrenamiento
                    break;

                case 5:
                    System.out.println("");
                    darEntrevistaEquipo(); //dar entrevista
                    break;

                case 6:
                    System.out.println("");
                    curarLesionEquipo();
                    break;

                case 7:
                default:
                    System.out.println(" Se equivoco de opcion de menu");
                    break;

            }

            System.out.println("");

        } while (opcion != 7);
    }

    public static void viajeEquipo() {
        //for if (persona es que el que almacena toda la informacion que esta toda adentro del array)
        for (Persona equipo : persona) {
            System.out.println(equipo.getNombre() + " " + equipo.getApellido());
            equipo.viajar();
        }
    }

    public static void entrenamientoEquipo() {
        //for if (persona es que el que almacena toda la informacion que esta toda adentro del array)
        for (Persona equipo : persona) {
            System.out.println(equipo.getNombre() + " " + equipo.getApellido());
            equipo.entrenamiento();
        }
    }

    public static void partidoFutbolEquipo() {
        //for if (persona es que el que almacena toda la informacion que esta toda adentro del array)
        for (Persona equipo : persona) {
            System.out.println(equipo.getNombre() + " " + equipo.getApellido());
            equipo.partidoFutbol();
        }
    }

    public static void planificarEntrenamientoEquipo() {

        System.out.println(entrenador1.getNombre() + " " + entrenador1.getApellido() + " -> ");
        ((Entrenador) entrenador1).planificarEntrenamiento();

    }

    public static void darEntrevistaEquipo() {

        System.out.println(futbolista1.getNombre() + " " + entrenador1.getApellido() + " -> ");
        ((Futbolista) futbolista1).entrevista();

        System.out.println(futbolista2.getNombre() + " " + entrenador1.getApellido() + " -> ");
        ((Futbolista) futbolista2).entrevista();
    }
    
     public static void curarLesionEquipo() {

        System.out.println(doctor1.getNombre() + " " + entrenador1.getApellido() + " -> ");
        ((Doctor) doctor1).curarLesion();

        
    }
}


