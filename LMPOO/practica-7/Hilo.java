public class Hilo extends Thread{

	private int contador = 10;
	private static int hilos = 0;
	private int tiempo=0;

	public Hilo(int t){
		super("Hilo " + ++hilos);
		this.tiempo = t;
	}

	public String toString(){
		return  getName() + ": " + contador;
	}

	public void run(){
		while(contador > 0){
			System.out.println(this);
			contador--;
			try{
				sleep(tiempo);
			}catch(InterruptedException e){
			}
		}

	}
}