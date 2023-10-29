package dominio;

import java.util.ArrayList;
import java.util.List;

public class Municipio {
    private List<Localidad> localidades = new ArrayList<>();

    public void agregarLocalidades(Localidad localidad){
        localidades.add(localidad);

    }

    public int contarHabitantes(){
        int totalHabitantes = 0;
        for (Localidad localidad : localidades) {
            totalHabitantes += localidad.getNumHabitantes();
        }
        return totalHabitantes;
    }
    public String toString(){
        return ("Municipio [localidades=]" + localidades + "]") ;
    }
}
