package dominio;

import java.util.ArrayList;
import java.util.List;

public class Municipio {
    private List<Localidad> localidades = new ArrayList<>();

    public void agregarLocalidad(Localidad localidad) {
        localidades.add(localidad);
    }

    public int contarHabitantes() {
        int totalHabitantes = 0;
        for (Localidad localidad : localidades) {
            totalHabitantes += localidad.getNumHabitantes();
        }
        return totalHabitantes;
    }

    @Override
    public String toString() {
        return "Municipio [localidades=" + localidades + "]";
    }

    public List<Localidad> getLocalidades() {
        return localidades;
    }

    public Localidad getLocalidad(int index) {
        if (index >= 0 && index < localidades.size()) {
            return localidades.get(index);
        } else {
            return null; // Manejar el caso en el que el índice es inválido
        }
    }

    public int getNombre() {
        return 0;
    }
}