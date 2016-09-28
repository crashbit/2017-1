import java.net.*;
import java.io.*;

public class Server{

	public static void main(String args[]) throws IOException{

		ServerSocket servidor = new ServerSocket(9090);
		Socket cliente = servidor.accept();

		PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);
		BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
		String cadena;

		salida.println("Bienvenido usuario");

		cadena = entrada.readLine();

		salida.println("Usted usuario tecleo " + cadena);
		System.out.println("El usuario tecleo " + cadena);

	}

}
