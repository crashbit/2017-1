public class Test{

	public static void main(String args[]){
		int i;
		Hilo hilo1 = new Hilo(1000);
		Hilo hilo2 = new Hilo(5000);
		Hilo hilo3 = new Hilo(2000);
		Hilo hilo4 = new Hilo(10000);
		Hilo hilo5 = new Hilo(500);

		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
		hilo5.start();
	}

}