
/**
 * Write a description of class Date here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Date
{
     private int dia;
    private int mes;
    private int año;

    public Date() {
    }

    public Date(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    
     public int calcularEdad() {
        int añoActual = 2023; 
        int edad = añoActual - año;
        return edad;
    }
}
