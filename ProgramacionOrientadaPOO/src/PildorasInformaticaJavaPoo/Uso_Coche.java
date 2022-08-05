
package PildorasInformaticaJavaPoo;

import javax.swing.*;
public class Uso_Coche {
    
    public static void main(String[] args) {
        
        Coche Rebault = new Coche(); //INSTANCIAR UNA COCHE. EJEMPLEAR DE CLASE
        
        
        Rebault.estableceColor(JOptionPane.showInputDialog("Introduce color: "));
        
        System.out.println(Rebault.DimeDatosGenerales());
        
        
        System.out.println(Rebault.DimeColor());
        
        Rebault.configuraAsientos(JOptionPane.showInputDialog("¿tiene asientos de cuero? " ));
        
        System.out.println(Rebault.DimeAsientos());
        
        Rebault.configuraClimatizador(JOptionPane.showInputDialog("¿tiene Climatizador?  "));
        
        System.out.println(Rebault.Dimeclimatizador());
        
        System.out.println(Rebault.DimePesoCoche());
        
        System.out.println("El precio final del coche es: "+ Rebault.DimePrecioCoche());
        
        
       // System.out.println("Este coche tiene "+ Rebault.DimeLargo() + " ruedas.");
    }
}
