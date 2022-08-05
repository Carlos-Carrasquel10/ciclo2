
package PILARESPOOformas;


public  abstract class Poligono {
    
    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "Poligono{" + "numeroLados=" + numeroLados + '}';
    }
    
    //declaramos que es una clase abstracta 
    public abstract double area();
}
