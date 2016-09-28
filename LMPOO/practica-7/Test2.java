public class Test2{

	public static void main(String args[]){
		int i;
		Thread hilo;

		for(i = 0; i< 5; i++){
			hilo = new Thread(new HiloContador(1000));
			hilo.start();
		}

	}

}