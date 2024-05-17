
/**
 * Write a description of class Granja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;
public class Granja
{
    private ArrayList<Animal> animales = new ArrayList<Animal>();

    public Granja() {
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }
     
    public int contarAnimales(String tipo) {
        int count = 0;
        for (Animal animal : animales) {
            if (animal.getTipo().equalsIgnoreCase(tipo)) {
                count++;
            }
        }
        return count;
    }
    
    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }  
    
}
