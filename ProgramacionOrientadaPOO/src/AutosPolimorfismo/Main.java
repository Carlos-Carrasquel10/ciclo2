
package AutosPolimorfismo;


public class Main {
    
    public static void main(String[] args) {
        
        Vehiculo misVehiculos [] = new Vehiculo[4]; //declaramos un array para utilizar las anteriores clases
        
        misVehiculos[0] = new Vehiculo ("GWT675", "Audi","2022");
        misVehiculos[1] = new VehiculoTurismo("GWT675", "Audi","2022",4);
        misVehiculos[2] = new VehiculoDeportivo("GWT675", "Audi","2022",3000);
        misVehiculos[3] = new VehiculoFurgoneta("GWT675", "Audi","2022",500);
        
        
        for(Vehiculo i : misVehiculos){ //for if "recorremos todo el arreglo y motsramos cada posicion"
            
            System.out.println(i.MostrarDatos());
            System.out.println(" ");
        }
    }
}
