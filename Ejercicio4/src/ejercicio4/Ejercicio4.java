
package ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        //variables
        int numero1;
        
        System.out.println("Digite un numero: ");
        numero1 = sc.nextInt();
        
        
        for (int i = 1; i <= 10; i++) {
            
           
            System.out.println("La multiplicacion "+ numero1 * i );
            
        }
    }
    
}
