import java.io.*;
import java.util.*;

public class Archivo{

	public static void main(String args[]){
		//FileReader archivo = new FileReader("texto.txt");
		String cadena;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		Scanner teclado = new Scanner(System.in);
		try{
			cadena = br.readLine();
			System.out.println("El usuario tecleo: " + cadena);
			cadena = teclado.nextLine();
			System.out.println("El usuario tecleo: " + cadena);
		}catch(IOException var){
			System.out.println("Hay un error!! ");
		}
	}


}