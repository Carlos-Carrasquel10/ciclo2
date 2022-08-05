
package com.mycompany.variables;

import javax.swing.JOptionPane;

public class Variables {

    public static void main(String[] args) {
      
 
       String Cadena;
       int entero;
       double decimal;
       
      //se pide los datos
      Cadena = JOptionPane.showInputDialog("Digite la Cadena ");
      entero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero ")); //convertimos a Entero
      decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite la decimal "));
      
      //se imprime los datos 
      JOptionPane.showMessageDialog(null, "la cadena es: "+Cadena);
      JOptionPane.showMessageDialog(null, "la cadena es: "+entero);
      JOptionPane.showMessageDialog(null, "la cadena es: "+decimal);
      
      
     
    
        
    }
}
