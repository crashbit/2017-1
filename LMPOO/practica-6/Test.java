public class Test{

	public static void main(String args[]){

		Empleado jose = new Empleado("jose");
		Empleado andy = new Gerente("andy");
		Empleado itzel = new Cajero("iztel");
		Oficina godinesSA = new Oficina();
		Asesor andrea = new Asesor("asesor");


		godinesSA.laborar(jose);
		godinesSA.laborar(andy);
		godinesSA.laborar(itzel);
		godinesSA.laborar(andrea);

		godinesSA.checarEntrada(jose);
		godinesSA.checarEntrada(andy);
		godinesSA.checarEntrada(itzel);
	}

}