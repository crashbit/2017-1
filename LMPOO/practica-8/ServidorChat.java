import java.net.*;
import java.io.*;

public class ServidorChat{
	static Socket cliente;
	static ClienteHilo t[] = new ClienteHilo[10];

	public static void main(String args[]) throws IOException{
		int i = 0;

		try{

			ServerSocket servidor = new ServerSocket(9090);
			System.out.println("¡¡Servidor activo!!");

			while(i<10){
				cliente = servidor.accept();
				ClienteHilo ch = new ClienteHilo(cliente, t);
				t[i] = ch;
				ch.start();
				i++;
			}
		}catch(Exception e){
			System.out.println("Error...!!");
		}

	}

}