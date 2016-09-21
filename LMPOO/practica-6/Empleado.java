public class Empleado{
	String nombre;
	int sueldo;

	public Empleado(){
		this.nombre = "nobody";
		this.sueldo = 0;
	}

	public Empleado(String nom){
		this.nombre = nom;
		this.sueldo = 0;
	}

	void trabaja(){
		System.out.println("Empleado trabajando");
	}

	public String toString(){
		return this.nombre;
	}
}