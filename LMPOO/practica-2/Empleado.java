public class Empleado{
	
	private String nombre;
	private int sueldo;
	private static int contador = 0;
	private int numEmpleado;

	public Empleado(String nombre, int sueldo){
		this.sueldo = sueldo;
		this.nombre = nombre;
		contador++;
		numEmpleado = contador ;
	}

	void setNombre(String nombre){
		this.nombre = nombre;
	}

	String getNombre(){
		return nombre;
	}

	void setSueldo(int sueldo){
		this.sueldo = sueldo;
	}

	int getSueldo(){
		return sueldo;
	}


	public String toString(){
		return numEmpleado + " Yo me llamo " + nombre + " y gano: " + sueldo + " pesos";
	}

}







