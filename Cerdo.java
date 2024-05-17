
/**
 * Write a description of class Cerdo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cerdo extends Animal
{
     private int grasa;
    
    public Cerdo(){
        
    }

    public Cerdo(int id, String nombre, double peso, Date fechaNacimiento,int grasa) {
        super(id, nombre, peso, "Cerdo", fechaNacimiento);
        this.grasa = grasa;
    }

    public int getGrasa() {
        return grasa;
    }

    public void setGrasa(int grasa) {
        this.grasa = grasa;
    }
}
