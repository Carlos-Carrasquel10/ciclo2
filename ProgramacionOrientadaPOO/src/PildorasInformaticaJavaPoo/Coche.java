package PildorasInformaticaJavaPoo;

public class Coche {

    //atributos
    private int ruedas;
    
    private int largo;
    
    private int ancho;
    
    private int motor;
    
    private int pesoPlataforma;
    
    private String color;
    
    private int pesoTotal;
    
    private Boolean asientos_cuero, climatizador;
    

    //metodo constructor
    public Coche() { //Metodo constructor tiene el mismo nombre que la clase

        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        pesoPlataforma = 500;
    }

    public String DimeDatosGenerales() { //METODO GETTER

        return "La plataforma del veniculo tiene " + ruedas + " ruedas "
                + ". Mide " + largo / 1000 + " metros con un ancho de " + ancho
                + " cm y un peso de plataforma de " + pesoPlataforma + " kg ";

    }

    //establecemos parametros para el color
    public void estableceColor(String color_coche) { //metodo SETTER

        color = color_coche;
        //color = "Azul";

    }

    //retornamos el color del coche
    public String DimeColor() {//METODO GETTER

        return "El color del coche es: " + color;
    }

    public void configuraAsientos(String asientos_cuero) { //METODO SETTER

        if (asientos_cuero.equalsIgnoreCase("si")) { //comparamos cadenas de caracteres ignorando las mayusculas

            this.asientos_cuero = true;

        } else {
            this.asientos_cuero = false;
        }

    }

    public String DimeAsientos() { //METODO GETTER

        if (asientos_cuero == true) {
            return "El coche tiene asientos de cuero";
        } else {
            return "El coche no tiene asientos de cuero";
        }
    }
    //configura el estado del climatizador
    public void configuraClimatizador(String climatizador) { //METODO SETTER

        if (climatizador.equalsIgnoreCase("si")) { //comparamos cadenas de caracteres ignorando las mayusculas

            this.climatizador = true;

        } else {
            this.climatizador = false;
        }

    }
    //returna el climatizador
    public String Dimeclimatizador() { //METODO GETTER

        if (climatizador == true) {
            return "El coche tiene climatizador ";
        } else {
            return "El coche no tiene climatizador";
        }

    }
    
    public String DimePesoCoche(){ //METODO SETTER Y GETTER
    
        int peso_carroceria = 500;
        
        pesoTotal = peso_carroceria + peso_carroceria;
        
        if(asientos_cuero == true){
        
            pesoTotal = pesoTotal + 50;
            
            
        }if(climatizador == true){
        
            pesoTotal = pesoTotal + 20;
        }
        
        return "El peso del coche es " +pesoTotal;
    }
    
    public int DimePrecioCoche(){
        
        int precioFinal = 10000;
        
        if(asientos_cuero == true){
            
            precioFinal+=2000;
        }
        if(climatizador == true){
            
            precioFinal+=1500;
        }
        
        return precioFinal;
    }
    
}
