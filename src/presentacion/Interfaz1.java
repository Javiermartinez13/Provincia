package presentacion;
import dominio.*;
import java.io.*;
import java.util.*;

public class Interfaz1 {
    public static boolean procesarPeticion (String peticion, ArrayList<Provincia> l){
        String [] p=peticion.split(" ");
        if (p.length==2)
            if (p[0].equals("addProvincia"))
                aniadirProvincia(p[1],l);
            else if (p[0].equals("addMunicipio"))
                aniadirMunicipio(p[1],l)
            else if (p[0].equals("addLocalidad"))
                aniadirLocalidad(p[1],l)
            else // peticion erronea
                System.out.println("peticion erronea. Pida la ayuda 'help'");
        else if (p.length==1)
                if (p[0].equals("leer"))
                    l=leer();
                else if (p[0].equals("list"))
                    System.out.println (l);
                else if (p[0].equals("help"))
                    System.out.println ("introduzaca una de las siguientes peticiones: \n addProvincia nombre: añadir Provincia\n addMunicipio nombre: añadir Municipio\n addLocalidad nombre: añadir Localidad\n list: listar el contenido\n leer: lectur inicial\n exit: salir\n");
                else if  (p[0].equals("exit"))
                    return false;
        else {
            System.out.println("peticion erronea");
            procesarPeticion("help",l);
        }
        return true;//en todos los casos debe seguir pidiendo y procesando peticiones
    }
    public static void aniadirProvincia(String nombre, ArrayList<Provincia> l){
        Provincia p=new Provincia();
        l.add(p);
    }
    public static void aniadirMunicipio(String nombre, ArrayList<Provincia> l){
        Municipio m=new Municipio();
        for (int i=0;i<l.size();i++)
            System.out.println(i+": " + l.get(i).getNombre());
        System.out.println("introduzca el número de la provincia: ");
        int i=sc.nextInt();
        sc.nextLine();
        l.get(i).add(m);
    }
    public static void aniadirLocalidad(String nombre, ArrayList<Provincia> l){
        Localidad l=new Localidad();
        for (int i=0;i<l.size();i++)
            System.out.println(i+": " + l.get(i)getNombre());
        System.out.println("Introduzca el número de la provincia: ");
        int i=sc.nextInt();
        sc.nextLine();
        for (int j=0;j<l.get(i).size();j++)
            System.out.println(j+": " + l.get(i).get(j).getNombre());
        System.out.println("Introduzca el número de municipio: ");
        int j=sc.nextInt();
        sc.nextLine();
        l.get(i).get(j).add(l);
    }
    public static String lerrPeticion(){
        
    }
}
