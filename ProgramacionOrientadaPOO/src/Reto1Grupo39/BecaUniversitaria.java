package Reto1Grupo39;

public class BecaUniversitaria {

    // Atributos
    private int Tiempo;
    private double monto;
    private double interes;

    // Métodos
    public BecaUniversitaria() {
        Tiempo = 0;
        monto = 0;
        interes = 0;
    }

    // Constructores
    public BecaUniversitaria(int pTiempo, double monto, double interes) {
        this.Tiempo = pTiempo;
        this.monto = monto;
        this.interes = interes;
    }

    public double calcularInteresSimple() {

        double interesSimple = monto * (interes / 100) * Tiempo;

        return Math.round(interesSimple); //redondeamos el resultado
    }

    public double calcularInteresCompuesto() {

        double interesCompuesto = monto * (Math.pow(1 + interes / 100, Tiempo) - 1);

        return Math.round(interesCompuesto); //redondeamos el resultado
    }

    public String compararInversion(int pTiempo, double pMonto, double pInteres) {
        this.Tiempo = pTiempo;
        this.monto = pMonto;
        this.interes = pInteres;

        double diferencia = calcularInteresCompuesto() - calcularInteresSimple();

        if (diferencia != 0) {
            return "La diferencia entre la proyección de interés compuesto e interés simple es:"+diferencia;
        }else{
        
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }

    }
    
    public String compararInversion() {
        double diferencia = 0;
        diferencia = calcularInteresCompuesto() - calcularInteresSimple();

        if (diferencia != 0) {
            return "La diferencia entre la proyección de interés compuesto e interés simple es:"+diferencia;
        }else{
        
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }

    }
    
    public static void main(String[] args) {
        BecaUniversitaria becaUniversitaria = new BecaUniversitaria();
        System.out.println(becaUniversitaria.calcularInteresSimple());
        System.out.println(becaUniversitaria.calcularInteresCompuesto());
        System.out.println(becaUniversitaria.compararInversion(60, 13000, 1.4));
    }

}
