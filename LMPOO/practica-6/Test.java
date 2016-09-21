public class Test{

	public static void main(String args[]){

		Empleado jose = new Empleado();
		Empleado andy = new Gerente();
		Empleado itzel = new Cajero();
		Oficina godinesSA = new Oficina();
		Asesor andrea = new Asesor();


		godinesSA.laborar(jose);
		godinesSA.laborar(andy);
		godinesSA.laborar(itzel);

		godinesSA.checarEntrada(jose);
		godinesSA.checarEntrada(andy);
		godinesSA.checarEntrada(itzel);
	}

}