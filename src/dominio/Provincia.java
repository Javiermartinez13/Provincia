package dominio;

import java.util.ArrayList;
import java.util.List;

public class Provincia {
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

    public Municipio getMunicipio(int index) {
        if (index >= 0 && index < municipios.size()) {
            return municipios.get(index);
        } else {
            return null; // Manejar el caso en el que el índice es inválido
        }
    }
}