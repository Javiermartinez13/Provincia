package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Provincia implements Serializable {
    private String nombre;
    private List<Municipio> municipios = new ArrayList<>();

    // Constructor
    public Provincia(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMunicipio(Municipio municipio) {
        municipios.add(municipio);
    }

    public int contarHabitantes() {
        int totalHabitantes = 0;
        for (Municipio municipio : municipios) {
            totalHabitantes += municipio.contarHabitantes();
        }
        return totalHabitantes;
    }

    @Override
    public String toString() {
        return "Provincia [nombre=" + nombre + ", municipios=" + municipios + "]";
    }

    // Método para obtener el nombre de la provincia
    public String getNombre() {
        return nombre;
    }

    public List<Municipio> getMunicipios() {
        return municipios;
    }

   
}