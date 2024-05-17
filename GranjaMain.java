
/**
 * Write a description of class GranjaMain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class GranjaMain
{ public static void main(String[] args) {
       Granja granja = new Granja();
       
        
        Gallina gallina = new Gallina(1056, "Ana", 6.5, new Date(8, 7, 2020), 68);
        Vaca vaca = new Vaca(1785, "Laura", 400.0, new Date(4, 10, 2018), 25.5);
        Cerdo cerdo = new Cerdo(2657, "Sergio", 148.0, new Date(7, 9, 2016), 25);
        Gallina nuevaGallina = new Gallina(7533, "Sofia", 2.8, new Date(4, 5, 2019), 80);
        Cerdo nuevocerdo = new Cerdo(6745,"Jose",200.0,new Date(3,2,2000),30);
        
        granja.agregarAnimal(gallina);
        granja.agregarAnimal(vaca);
        granja.agregarAnimal(cerdo);
        granja.agregarAnimal(nuevaGallina);
        granja.agregarAnimal(nuevocerdo);
       
        mostrarInformacionAnimales(granja);
       
    }
    
    public static void mostrarInformacionAnimales(Granja granja) {
        ArrayList<Animal> animales = granja.getAnimales();
        System.out.println("Animales en la granja:");
        
        for (Animal animal : animales) {
            System.out.println("Nombre: " + animal.getNombre());
            System.out.println("Tipo: " + animal.getTipo());
            System.out.println("Peso: " + animal.getPeso()+" KG");
            System.out.println("Edad: " + animal.calcularEdad() + " años");
            
            if (animal instanceof Gallina) {
                Gallina gallina = (Gallina) animal;
                System.out.println("Número de huevos: " + gallina.getNumHuevos());
            } else if (animal instanceof Vaca) {
                Vaca vaca = (Vaca) animal;
                System.out.println("Litros de leche: " + vaca.getLitrosLeche());
            } else if (animal instanceof Cerdo) {
                Cerdo cerdo = (Cerdo) animal;
                System.out.println("Grasa: " + cerdo.getGrasa() + " %");
            }
            
            System.out.println();
        }
    int numGallinas = granja.contarAnimales("Gallina");
    int numVacas = granja.contarAnimales("Vaca");
    int numCerdos = granja.contarAnimales("Cerdo");

    System.out.println("Número de gallinas: " + numGallinas);
    System.out.println("Número de vacas: " + numVacas);
    System.out.println("Número de cerdos: " + numCerdos);
    }
}
