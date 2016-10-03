import java.net.*;
import java.io.*;

public class Server{

	public static void main(String args[]) throws IOException{

		ServerSocket servidor = new ServerSocket(9090);
		Socket cliente;
		PrintWriter salida;
		BufferedReader entrada;
		String cadena = "";

		while(cadena.compareTo("salida") != 0){			
			cliente = servidor.accept();

			salida = new PrintWriter(cliente.getOutputStream(), true);
			entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));

			salida.println("Bienvenido usuario");

			cadena = entrada.readLine();

			salida.println("Usted usuario tecleo " + cadena);
			System.out.println("El usuario tecleo " + cadena);
		}

	}

}
