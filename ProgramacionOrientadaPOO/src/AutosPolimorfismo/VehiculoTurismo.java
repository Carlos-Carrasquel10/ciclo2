
package AutosPolimorfismo;


public class VehiculoTurismo extends Vehiculo{
    
    private int nPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo, int nPuertas) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }
    
    @Override
    public String MostrarDatos() {
        return "VehiculoTurismo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + "nPuertas=" + nPuertas +'}';
    }
    
}
