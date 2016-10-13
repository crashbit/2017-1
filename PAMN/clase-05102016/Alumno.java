public class Alumno{
	private int edad;
	private String nombre;

	public Alumno(){
		this.nombre = "Don nadie";
	}

	public Alumno(String nombre){
		this.nombre = nombre;
	}

	public String toString(){
		return "Yo soy " + nombre; 
	}

	public void setNombre(String nom){
		this.nombre= nom;
	}

	public String getNombre(){
		return this.nombre;
	}

	public void leer(){
		System.out.println("Alumno leyendo");	
	}

	public void leer(String lectura){
		System.out.println("leyendo " + lectura);	
	}

}