/*
LEER UN NUMERO Y MOSTRAR SU CUADRADO, REPETIR EL PROCESO
HASTA QUE SE INTRODUZCA UN NEGATIVO
 */

package com.mycompany.ejercicio;

import javax.swing.JOptionPane;


public class Ejercicio {

    public static void main(String[] args) {
        
        int numero, cuadrado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        while(numero>=0){ //mientras el numero sea 0 o positivo 
        
            cuadrado = (int)Math.pow(numero, 2); //sacar el cuadrado de un numero
            JOptionPane.showMessageDialog(null,"El numero "+numero+" elevado al cuadrado es: "+cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        }
    }
}
