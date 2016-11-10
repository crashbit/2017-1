public class Test{

	public static void main(String args[]){

		HiloTest prueba1 = new HiloTest(500);
		HiloTest prueba2 = new HiloTest(1000);
		HiloTest prueba3 = new HiloTest(5000);
		HiloTest prueba4 = new HiloTest(2000);
		HiloTest prueba5 = new HiloTest(100);
		prueba1.start();
		prueba2.start();
		prueba3.start();
		prueba4.start();
		prueba5.start();
	}


}