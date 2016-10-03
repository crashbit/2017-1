import java.net.*;
import java.io.*;

public class ClienteHilo extends Thread{
	private PrintWriter salida;
	private BufferedReader entrada;
	private Socket clienteSocket = null;
	private final ClienteHilo[] hilos;
	private int maxClientes;

	public ClienteHilo(Socket clienteSocket, ClienteHilo[] hilos){
		this.clienteSocket = clienteSocket;
		this.hilos = hilos;
		maxClientes = hilos.length;
	}

	public void run(){
		int maxClientesCuenta = this.maxClientes;
		int i;
		String cadena;
		String nombre;

		try{
			entrada = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));
			salida = new PrintWriter(clienteSocket.getOutputStream(), true);

			salida.println("Bienvenido al chat");
			salida.println("Teclea tu nickname: ");
			nombre = entrada.readLine();

			salida.println("Hola " + nombre);

			for(i = 0; i< maxClientesCuenta; i++){
				if(hilos[i]!=null && hilos[i] != this){
					hilos[i].salida.println("Acaba de entrar :" + nombre);
				}
			}

			while(true){
				cadena = entrada.readLine();
				for(i = 0; i< maxClientesCuenta; i++){
					if(hilos[i]!=null && hilos[i] != this){
						hilos[i].salida.println(nombre + " dijo>> " + cadena );
					}
				}

			}

		}catch(Exception e){
			System.out.println("Error");
		}


	}


}