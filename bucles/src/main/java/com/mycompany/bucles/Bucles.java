/*
 
 */

package com.mycompany.bucles;

import java.util.Scanner;


public class Bucles {

    public static void main(String[] args) {
       
       
        Scanner sc = new Scanner(System.in);
     /*   while(1<=10){  
            System.out.println(i);
            i++;
        } */
        
        
        
        
     /*     do{
            System.out.println(i);
            i++;
        }while(i<=10); */
     
     
        System.out.println("Digite la cantidad");
        int cantidad = sc.nextInt();
     
        for (int i = 1; i <= cantidad; i++) {
            System.out.println(i);
        }
        
    }
}
