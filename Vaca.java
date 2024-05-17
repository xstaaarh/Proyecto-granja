
/**
 * Write a description of class Vaca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vaca extends Animal
{
    private double litrosLeche;
    
    public Vaca(){
        
    }

    public Vaca(int id, String nombre, double peso, Date fechaNacimiento, double litrosLeche) {
        super(id, nombre, peso, "Vaca", fechaNacimiento);
        this.litrosLeche = litrosLeche;
    }

    public double getLitrosLeche() {
        return litrosLeche;
        
    }

    public void setLitrosLeche(double litrosLeche) {
        this.litrosLeche = litrosLeche;
    }
    
}
