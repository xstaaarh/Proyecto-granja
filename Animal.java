
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal
{
     private int id;
    private String nombre;
    private double peso;
    private String tipo;
    private Date fechaNacimiento;

    public Animal() {
    }

    public Animal(int id, String nombre, double peso, String tipo, Date fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.tipo = tipo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

   public int calcularEdad() {
        return fechaNacimiento.calcularEdad();
    }

}
