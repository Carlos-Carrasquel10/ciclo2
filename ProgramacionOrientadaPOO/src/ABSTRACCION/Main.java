
package ABSTRACCION;


public class Main {
    
    public static void main(String[] args) {
        
        Planta planta1 = new Planta();
        AnimalCarnivoro animalC1 = new AnimalCarnivoro();
        AnimalHerbivoro animalH1 = new AnimalHerbivoro();
        
        planta1.alimentarse();
        animalC1.alimentarse();
        animalH1.alimentarse();
        
    }
    
}
