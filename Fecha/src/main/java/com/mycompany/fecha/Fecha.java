package com.mycompany.fecha;

import javax.swing.JOptionPane;

public class Fecha {

    public static void main(String[] args) {

        /*pedir el dia mes y año de una fecha indicar si es correcta suponiendo que todos los meses 
        son de 30 dias */
        int dia, mes, año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {

            if ((dia >= 1) && (dia <= 31)) {
                if ((mes >= 1) && (mes <= 12)) {
                    if (año > 0) {
                        JOptionPane.showMessageDialog(null, "Fecha correcta");

                    } else {
                        JOptionPane.showMessageDialog(null, "año incorrecto");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "mes incorrecto");
                }

            } else {
                JOptionPane.showMessageDialog(null, "dia incorrecto");
            }

        } else if (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) {

            if ((dia >= 1) && (dia <= 30)) {
                if ((mes >= 1) && (mes <= 12)) {
                    if (año > 0) {
                        JOptionPane.showMessageDialog(null, "Fecha correcta");

                    } else {
                        JOptionPane.showMessageDialog(null, "año incorrecto");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "mes incorrecto");
                }

            } else {
                JOptionPane.showMessageDialog(null, "dia incorrecto");
            }

        }
        
        else {

            JOptionPane.showMessageDialog(null, "FECHA INCORRECTA"
                    + "");
        }

    }
}
