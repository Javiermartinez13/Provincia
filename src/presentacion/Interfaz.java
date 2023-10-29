package presentacion;
import dominio.*;
import java.util.ArrayList;
import java.util.Scanner;

import dominio.Municipio;
import dominio.Provincia;
public class Interfaz {

    public static ArrayList < Provincia > leer() {

        ArrayList < Provincia > provincias = new ArrayList < > ();

        Scanner sc = new Scanner(System.in);
    }

    do {
        System.out.print("Nombre de la provincia (enter para finalizar)");
        String nomProvincia = sc.nextLine();
        if (nomProvincia != "") {
            Provincia p = new Provincia();

            do {
                System.out.println("Nombre del municipio (enter para finalizar) ");
                String nomMunicipio = sc.nextLine();

                if (nomMunicipio != "") {
                    Municipio m = new Municipio();
                    p.add Municipio(m);

                    do {
                        System.out.println("Nombre de la Localidad (enter para finalizar)");
                        String nonLocalidad = sc.nextLine();
                        int nomHabitantes = sc.nextLine();
                        if (nomLocalidad != "") {
                            Localidad l = new Localidad(nomLocalidad, nomHabitantes);
                            m.addLocalidad(l);
                        }


                    }



                }


            }

        }

    } while (nomProvincia != "");
        return provincias;

}