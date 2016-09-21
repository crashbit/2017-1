public class Oficina{

	public Oficina(){
		System.out.println("Oficina abierta");
	}

	void laborar(Empleado godin){
		godin.trabaja();
	}

	void checarEntrada(Empleado godin){
		if(godin instanceof Gerente)
			System.out.println("Los gerentes puede entrar tarde");
		else
			System.out.println("Usted no puede entrar tarde");
	}	


}