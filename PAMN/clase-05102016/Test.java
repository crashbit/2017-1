public class Test{

	public static void main(String args[]){

		Alumno pepe = new Alumno();
		Alumno andrea = new Alumno("Andrea");
		pepe.nombre = "Pepe";
		System.out.println("Hola mundo " + pepe);
		System.out.println("Hola mundo " + andrea);
		pepe.leer();
		andrea.leer("Algebra");

	}
}