package Metodos;

public class Operacion {

    public int sumar(int num1, int num2) {

        int suma = num1 + num2;

        return suma;
    }

    public int restar(int num1, int num2) {

        int resta = num1 - num2;

        return resta;
    }

    public int multiplicar(int num1, int num2) {

        int mult = num1 * num2;

        return mult;
    }
    
     public int dividir(int num1, int num2){
   
       int div =num1 / num2;
       
       return div;
   }
     
    public void mostrarResultado(int suma, int resta, int mult, int div){
    
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La mult es: "+mult);
        System.out.println("La div es: "+div);
    
    }

}
