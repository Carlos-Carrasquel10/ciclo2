package PILARESPOOformas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //arreglo dinamicos
    //puede ser un triangulo o rectangulo
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        llenarPoligono();
        mostrarDatos();
        
        
    }

    public static void llenarPoligono() {
        char respuesta;
        int opcion = 0;
        do {
            do {

                System.out.println("Digite el poligono que se desea ejecutar");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.println("opcion: ");
                opcion = sc.nextInt();
            } while (opcion < 1 || opcion > 2);
                switch (opcion) {
                case 1:  leerTriangulo();// para llenar el triangulo

                    break;

                case 2: leerRectangulo();// para llenar el rectangulo

                    break;

            }
            System.out.println("\ndesea ingresar otro poligono(s/n): ");
            respuesta = sc.next().charAt(0);
            System.out.println("");
        } while (respuesta == 's' || respuesta == 'S');
    }

    public static void leerTriangulo() {

        double lado1, lado2, lado3;

        System.out.println("\n Digite el lado 1: ");
        lado1 = sc.nextInt();

        System.out.println("\n Digite el lado 2: ");
        lado2 = sc.nextInt();

        System.out.println("\n Digite el lado 3: ");
        lado3 = sc.nextInt();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        //guardamos el traingulo dentro de nuestro arreglo poligomo
        poligono.add(triangulo);
    }
    
    public static void leerRectangulo(){
    
        double lado1, lado2;

        System.out.println("\n Digite el lado 1: ");
        lado1 = sc.nextInt();

        System.out.println("\n Digite el lado 2: ");
        lado2 = sc.nextInt();

        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        
        poligono.add(rectangulo);   
    }
    public static void mostrarDatos(){
    
        for(Poligono i: poligono){
        
            System.out.println(i.toString());
            System.out.println("El area es: "+i.area());
            System.out.println("");
        }
    }
}
