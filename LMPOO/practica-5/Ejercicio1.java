public class Ejercicio1{

	public static void main(String args[]){

		int i;
		try{
			i = 1/1;
			System.out.println(args[0]);
		}catch(ArithmeticException e){
			System.out.println("No se vale esa operacion");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Falta parametro");
		}finally{
			System.out.println("Bloque finally");
		}

	}
}