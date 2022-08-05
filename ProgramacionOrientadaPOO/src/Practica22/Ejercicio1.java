
package Practica22;

import java.util.Scanner;


public class Ejercicio1 {
    
    /*Realizar la suma, la resta, la división y la multiplicación de dos números
    leídos por teclado y mostrar en pantalla “La <operación> de <número 1>
    y <número 2> es igual a <resultado> ”. */
    
    public static void main(String[] args) {
     
         Scanner leer = new Scanner(System.in); //libreria para leer datos por consola
         
         System.out.println("digite el numero que desea saber la tabla de multiplicar");
         int numero1 = leer.nextInt();
         for (int i = 0; i <= 10; i++) {
            
             System.out.println("La tabla: "+numero1+" * "+i+" es: "+numero1 * i);
        }
    }
}
