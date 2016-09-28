public class HiloContador implements Runnable{

	private String id;
	private int contador = 10;
	private static int hilos = 0;
	private int tiempo;

	public HiloContador(int t){
		hilos++;
		id = "Hilo " + hilos;
	}

	public String toString(){
		return  "Hilo-: " + contador;
	}

	public void run(){
		while(contador > 0){
			System.out.println(this);
			contador--;
			try{
				Thread.sleep(tiempo);
			}catch(InterruptedException e){
			}
		}
	}


}