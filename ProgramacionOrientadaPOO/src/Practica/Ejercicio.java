package Practica;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        double n1, n2, n3, total;
        
        System.out.println("Digite la primera nota");
        n1=sc.nextDouble();
        
        System.out.println("Digite la primera nota");
        n2=sc.nextDouble();
        
        System.out.println("Digite la primera nota");
        n3=sc.nextDouble();
        
        total= n1 + n2 + n3 / 3;
        
        if (total>=3.0){
            
            System.out.println("Aprobado");
        
        }else{
            System.out.println("No aprobado");
        
        }
       
}
}
