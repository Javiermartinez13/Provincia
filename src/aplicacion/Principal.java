package aplicacion;

import dominio.Localidad;
import dominio.Municipio;
import dominio.Provincia;



public class Principal {

    public static void main(String[] args) {

        Localidad localidad1 = new Localidad();
        localidad1.setNombre(" Villalba ");
        localidad1.setNumeroHabitantes(  33333);

        System.out.println( "Nombre Localidad1: "+ localidad1.getNombre() + " Número de Habitantes: " + localidad1.getNumHabitantes() );

        Municipio municipio1 = new Municipio();
        municipio1.agregarLocalidades(localidad1);
        int totalHabitantesMunicipio1 = municipio1.contarHabitantes();

        Localidad localidad2 = new Localidad();
        
        localidad2.setNombre(" Malaga ");

        localidad2.setNumeroHabitantes(333333);

        System.out.println("EL total de habitantes en el municipio 1: " + totalHabitantesMunicipio1);

        Provincia provincia1 = new Provincia();

        provincia1.agregarMunicipio(municipio1);

        int totalHabitantesProvincia1 = provincia1.contarHabitantes();

        System.out.println("El total de habitantes en la provincia 1: " + totalHabitantesProvincia1);
       
       
        System.out.println( "Nombre Localidad2: "+ localidad2.getNombre() + " Número de Habitantes: " + localidad2.getNumHabitantes() );

        
        Municipio municipio2 = new Municipio();

        
        municipio2.agregarLocalidades(localidad2);

        
        int totalHabitantesMunicipio2 = municipio2.contarHabitantes();

        System.out.println("El total de habitantes en el municipio 2: " + totalHabitantesMunicipio2);
        
        Provincia provincia2 = new Provincia();
        
        provincia2.agregarMunicipio(municipio2);
        
        System.out.println("El total de habitantes en la provincia 2: " + totalHabitantesMunicipio2);

    }
    
}


