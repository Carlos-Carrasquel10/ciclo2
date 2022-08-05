
package ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int Horas;
        int total;
        
        System.out.println("Digite las horas trabajadas: ");
        Horas=sc.nextInt();
        
        total = Horas * 30000;
        
        System.out.println(total);
        
    }
    
}
