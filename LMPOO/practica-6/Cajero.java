public class Cajero extends Empleado{

	public Cajero(String nom){
		super(nom);
		sueldo = 100;
	}

	void trabaja(){
		System.out.println("Cajero trabajando");
	}

}