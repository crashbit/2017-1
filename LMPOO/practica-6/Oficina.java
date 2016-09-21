public class Oficina{

	public Oficina(){
		System.out.println("Oficina abierta");
	}

	void laborar(Empleado godin){
		godin.trabaja();
	}

	void laborar(Asesor godin){
		godin.trabaja();
	}

	void checarEntrada(Empleado godin){
		if(godin instanceof Gerente)
			System.out.println("Usted " + godin + " es gerente, puede entrar tarde");
		else if(godin instanceof Cajero)
			System.out.println("Usted " + godin + " es cajero, NO puede entrar tarde");
		else
			System.out.println("Usted " + godin + " un empleado mas, NO puede entrar tarde");
	}

}