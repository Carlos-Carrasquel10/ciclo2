

package com.mycompany.trabajofechacorrecta;

import javax.swing.JOptionPane;


public class TrabajoFechaCorrecta {

    public static void main(String[] args) {
       
        int dia, mes, año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
        
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
        
            JOptionPane.showMessageDialog(null, "Fecha correcta");
   
        }
        
    }
}
