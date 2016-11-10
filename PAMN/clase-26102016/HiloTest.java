
public class HiloTest extends Thread{
	private int contador = 10;
	private static int hilos = 0;
	private int tiempo;

	public HiloTest(){
		super("Hilo->" + ++hilos);
	}

	public HiloTest(int t){
		super("Hilo->" + ++hilos);
		tiempo = t;
	}

	public String toString(){
		return getName() + ": " + contador;
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

			System.out.println(getName() + " terminado");

	}


}