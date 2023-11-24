package dominio;


public class Localidad {

    private String nombre;
    private int numHabitantes;

    public Localidad(String nombre, int numHabitantes) {
        this.nombre = nombre;
        this.numHabitantes = numHabitantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }

    @Override
    public String toString() {
        return "La localidad " + nombre + " tiene " + numHabitantes + " habitantes";
    }
}