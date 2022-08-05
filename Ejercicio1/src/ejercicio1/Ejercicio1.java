
package ejercicio1;

import java.util.Scanner;


public class Ejercicio1 {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int Suma, Resta, Division, Multiplicacion;
        int numero1,numero2;
        
        System.out.println("Digite un numero");
        numero1=sc.nextInt();
        
        System.out.println("Digite un numero");
        numero2=sc.nextInt();
        
        Suma = numero1 + numero2;
        Resta = numero1 - numero2;
        Division = numero1 / numero2;
        Multiplicacion = numero1 * numero2;
        
        System.out.println("La suma de " +numero1+ " y " +numero2+ " es igual a "+Suma);
        System.out.println("La Resta de " +numero1+ " y " +numero2+ " es igual a "+Resta);
        System.out.println("La Division de " +numero1+ " y " +numero2+ " es igual a "+Division);
        System.out.println("La Multiplicacion de " +numero1+ " y " +numero2+ " es igual a "+Multiplicacion);
        
        
        
        
        
    }
    
}
