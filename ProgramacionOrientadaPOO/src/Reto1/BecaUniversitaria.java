package Reto1;

public class BecaUniversitaria {

    //atributos
    int tiempo;
    double interes;
    double monto;

    BecaUniversitaria() {

        this.tiempo = 0;
        this.interes = 0;
        this.monto = 0;
    }

    BecaUniversitaria(int pTiempo, double pMonto, double Pinteres) {
        this.tiempo = pTiempo;
        this.monto = pMonto;
        this.interes = Pinteres;
    }

    public double calcularInteresSimple() {

        double interesSimple = Math.round(this.monto * this.interes / 100 * this.tiempo);

        return interesSimple;

    }

    public double calcularInteresCompuesto() {

        double interesCompuesto = this.monto * (Math.pow((1 + this.interes / 100), this.tiempo) - 1);
        interesCompuesto = Math.round(interesCompuesto); //se redondea el resultado

        return interesCompuesto;
    }

    //  public String compararInversion(int pTiempo, double pMonto, double pInteres) {
    // }
    public String compararInversion(int pTiempo, double pMonto, double pInteres) {
        this.tiempo = pTiempo;
        this.monto = pMonto;
        this.interes = pInteres;

        return this.compararInversion();
    }

    public String compararInversion() {

        double diferencia = this.calcularInteresCompuesto() - this.calcularInteresSimple();

        if (diferencia != 0) {

            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        } else {
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }

    }

    public static void main(String[] args) {

        BecaUniversitaria becaUniversitaria = new BecaUniversitaria();

        System.out.println(becaUniversitaria.calcularInteresSimple());
        System.out.println(becaUniversitaria.calcularInteresCompuesto());
        System.out.println(becaUniversitaria.compararInversion());

    }

}
