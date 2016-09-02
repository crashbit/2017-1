public class Cadenas{
	
	public static void main(String args[]){

		String nombre = "Pedro";
		char letra = nombre.charAt(1);


		if(nombre.startsWith("Pe")){
			System.out.println("Si empieza");
		}
		else{
			System.out.println("Noooo");
		}

		if(nombre.endsWith("dro")){
			System.out.println("Si termina");
		}
		else{
			System.out.println("Noooo termina");
		}


	}
}