public class Gerente extends Empleado{

	public Gerente(String nom){
		super(nom);
		sueldo = 300;
	}

	void trabaja(){
		System.out.println("Gerente trabajando");
	}
}