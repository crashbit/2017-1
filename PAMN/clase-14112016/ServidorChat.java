import java.io.*;
import java.net.*;

public class ServidorChat{
	static Socket clienteSocket;
	static ClienteHilo usuarios[] = new ClienteHilo[10];

	public static void main(String args[]) throws IOException{
		ServerSocket servidorSocket = new ServerSocket(9000);
		int i=0;
		while(true){
			clienteSocket = servidorSocket.accept();
			usuarios[i] = new ClienteHilo(clienteSocket, usuarios);
			usuarios[i].start();
			i = i + 1;
		}
	}
}