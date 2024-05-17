
/**
 * Write a description of class Gallina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gallina extends Animal
{
     private int numHuevos;
    
    public Gallina(){
        
    }

    public Gallina(int id, String nombre, double peso, Date fechaNacimiento, int numHuevos) {
        super(id, nombre, peso, "Gallina", fechaNacimiento);
        this.numHuevos = numHuevos;
    }

    public int getNumHuevos() {
        return numHuevos;
    }

    public void setNumHuevos(int numHuevos) {
        this.numHuevos = numHuevos;
    }
}
