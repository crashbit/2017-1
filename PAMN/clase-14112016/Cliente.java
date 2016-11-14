import java.io.*;
import java.net.*;

public class Cliente{

	public static void main(String args[])throws UnknownHostException, IOException{
		Socket clienteSocket = new Socket("www.ingenieria.unam.mx", 80);

		PrintWriter salida = new PrintWriter(clienteSocket.getOutputStream(), true);
		BufferedReader entrada = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));

		String cadena;

		salida.println("get /index.php");

		while((cadena = entrada.readLine())!= null){
			System.out.println(cadena);
		}

		salida.close();
		entrada.close();

	}
}
