package dominio;

public class Localidad {
	
	private String nombre;
	private int numHabitantes;
	
	public void setNombre(String nombre){
		this.nombre = nombre; 
	}
	public void setNumeroHabitantes(int numHabitantes){
		this.numHabitantes = numHabitantes;
	}
	public String getNombre(){
		return nombre;
	}
	public int getNumHabitantes(){
		return numHabitantes;
	}

	public String toString(){
		String result = ("La localidad" + nombre + "tiene" + numHabitantes + "habitantes");
		return result;
	}

}
