package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Municipio implements Serializable {
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

    

    public int getNombre() {
        return 0;
    }
}