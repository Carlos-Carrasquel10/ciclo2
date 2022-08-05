
package ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nombre;
        double nota1, nota2, nota3, total;
        
        System.out.println("Digite tu nombre: ");
        nombre=sc.nextLine();
        
        System.out.println("Digite la nota de la primera evaluacion : ");
        nota1=sc.nextDouble();
        
        System.out.println("Digite la nota de la segunda evaluacion : ");
        nota2=sc.nextDouble();
        
        System.out.println("Digite la nota de la tercera evaluacion : ");
        nota3=sc.nextDouble();
        
        total= ((nota1 + nota2 + nota3 )/ 3);
        
        if (nota1 >= 3.0){
            System.out.println("Aprovado" +total);
        }
        
        else{
            System.out.println("Reprobado" +total);
        }
        
    }
    
}
