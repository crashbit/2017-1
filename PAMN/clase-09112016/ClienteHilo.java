import java.io.*;
import java.net.*;


public class ClienteHilo extends Thread{
	static Socket cliente;
	static ClienteHilo usuarios[] = new ClienteHilo[10];

	public ClienteHilo(Socket cliente, ClienteHilo t[]){
		this.cliente = cliente;
		this.usuarios = t;
	}

	public void run(){
		try{
			PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);
			BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			String cadena;
			salida.println("Hola usuario: ");
			cadena = entrada.readLine();
			


		}catch(IOException e){

		}

	}

}