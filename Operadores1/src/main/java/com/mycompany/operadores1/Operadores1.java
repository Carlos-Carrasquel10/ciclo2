
package com.mycompany.operadores1;

import javax.swing.JOptionPane;


public class Operadores1 {

    public static void main(String[] args) {
        
        
        
        /*un formador de mision tic necesita calcular su salario semanal, el cual se obtiene de la 
        siguiente manera 
        
        si trabaja 40 hotas o menos se le paga: 16 USD por hora
        si trabaja mas de 40 Horas se le paga 16 dolares por cada de las primera 40 horas
        y 20 dolares por cada hora extra 
        
        calcular su salario   */      
        
        
        int horasTrabajadas;
        float salarioTotal;
        
        
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas"));
        
        if (horasTrabajadas <= 40){
        
               salarioTotal = horasTrabajadas * 16;
               JOptionPane.showMessageDialog(null,"Salario total del formador es:"+salarioTotal);
        }
        
        else{
        
                salarioTotal = (40*16) + ((horasTrabajadas-40)*20);
                
                JOptionPane.showMessageDialog(null,"Salario total del formador es:"+salarioTotal);
        }
        
        
        
        
       /*
        
        int num1, num2=5;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite num1: "));
        
        if (num1 == num2) {
        
            JOptionPane.showMessageDialog(null,"los numeros es igual"); //se pone siempre null 
        }
        
        else {
        
            JOptionPane.showMessageDialog(null,"son diferentes");
        }
        
        */
        
        
        /*
        int numero = 10;
        
        numero += 5; //aumentar o disminuir una variable
        numero ++; //aumentar en uno en uno
        System.out.println(numero); */
        
     /* 
        Scanner sc = new Scanner(System.in);
        //variables
        float numero1, numero2,suma, resta, mult, div, resto;
        
        //pedir datos por consola
        System.out.println("digite un numero");
        numero1 = sc.nextInt();
        System.out.println("digite un numero");
        numero2 = sc.nextInt();
        
        //operaciones arimeticas
        suma = numero1 + numero2;
        resta = numero1 - numero2; 
        mult = numero1 * numero2;
        div = numero1 / numero2;   
        resto = numero1 % numero2;
        
        //impresion por consola
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(resto); */
        
        
        
    }
}
