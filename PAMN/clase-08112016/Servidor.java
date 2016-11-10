import java.io.*;
import java.net.*;

public class Servidor{
	public static void main(String args[]) throws IOException{
		ServerSocket servidorSocket = new ServerSocket(9000);
		Socket clienteSocket;
		String cadena;

		clienteSocket = servidorSocket.accept();
		PrintWriter salida = new PrintWriter(clienteSocket.getOutputStream(), true);
		BufferedReader entrada = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));

		System.out.println("Se acaba de conectar un shiavo...");
		salida.println("Hola shiavo...");
		salida.println("Teclea algo shiavo... :v");
		cadena = entrada.readLine();
		System.out.println("El shiavo tecleo:" + cadena);
		salida.println("Tecleaste :v: " + cadena);
		salida.println("byes");



	}
}