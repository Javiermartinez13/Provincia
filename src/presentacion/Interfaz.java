package presentacion;

import dominio.Localidad;
import dominio.Municipio;
import dominio.Provincia;
import java.util.ArrayList;
import java.util.Scanner;

public class Interfaz {
    static Scanner sc = new Scanner(System.in);

    public static boolean procesarPeticion(String peticion, ArrayList<Provincia> provincias) {
        String[] partes = peticion.split(" ");
        if (partes.length == 2) {
            if (partes[0].equals("addProvincia")) {
                aniadirProvincia(partes[1], provincias);
            } else if (partes[0].equals("addMunicipio")) {
                aniadirMunicipio(partes[1], provincias);
            } else if (partes[0].equals("addLocalidad")) {
                aniadirLocalidad(partes[1], provincias);
            } else {
                System.out.println("Petición incorrecta. Pida la ayuda 'help'");
            }
        } else if (partes.length == 1) {
            if (partes[0].equals("leer")) {
                provincias = leer();
            } else if (partes[0].equals("list")) {
                System.out.println(provincias);
            } else if (partes[0].equals("help")) {
                System.out.println("Introduzca una de las siguientes peticiones: \n" +
                        "addProvincia nombre: añadir Provincia\n" +
                        "addMunicipio nombre: añadir Municipio\n" +
                        "addLocalidad nombre: añadir Localidad\n" +
                        "list: listar el contenido\n" +
                        "leer: lectura inicial\n" +
                        "exit: salir\n");
            } else if (partes[0].equals("exit")) {
                return false;
            } else {
                System.out.println("Petición incorrecta");
                procesarPeticion("help", provincias);
            }
        } else {
            System.out.println("Petición incorrecta");
            procesarPeticion("help", provincias);
        }
        return true;
    }

    private static ArrayList<Provincia> leer() {
        // Lógica para leer datos desde algún origen y devolver una lista de provincias
        return new ArrayList<>();
    }

    public static void aniadirProvincia(String nombre, ArrayList<Provincia> provincias) {
        Provincia provincia = new Provincia(nombre);
        provincias.add(provincia);
    }

    public static void aniadirMunicipio(String nombre, ArrayList<Provincia> provincias) {
        Municipio municipio = new Municipio();
        listarProvincias(provincias);
        System.out.println("Introduzca el número de la provincia: ");
        int i = sc.nextInt();
        sc.nextLine();
        if (i >= 0 && i < provincias.size()) {
            provincias.get(i).agregarMunicipio(municipio);
        } else {
            System.out.println("Número de provincia no válido.");
        }
    }

    public static void aniadirLocalidad(String nombre, ArrayList<Provincia> provincias) {
        Localidad localidad = new Localidad(nombre, 10);
        listarProvincias(provincias);
        System.out.println("Introduzca el número de la provincia: ");
        int i = sc.nextInt();
        sc.nextLine();
        if (i >= 0 && i < provincias.size()) {
            listarMunicipios(provincias.get(i));
            System.out.println("Introduzca el número de municipio: ");
            int j = sc.nextInt();
            sc.nextLine();
            if (j >= 0 && j < provincias.get(i).getMunicipios().size()) {
                provincias.get(i).getMunicipios().get(j).agregarLocalidad(localidad);
            } else {
                System.out.println("Número de municipio no válido.");
            }
        } else {
            System.out.println("Número de provincia no válido.");
        }
    }

    private static void listarProvincias(ArrayList<Provincia> provincias) {
        for (int i = 0; i < provincias.size(); i++) {
            System.out.println(i + ": " + provincias.get(i).getNombre());
        }
    }

    private static void listarMunicipios(Provincia provincia) {
        for (int j = 0; j < provincia.getMunicipios().size(); j++) {
            System.out.println(j + ": " + provincia.getMunicipio(j).getNombre());
        }
    }

    public static String leerPeticion() {
        return sc.nextLine();
    }
}
