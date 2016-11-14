import java.io.*;
import java.net.*;


public class ClienteHilo extends Thread{
	static Socket cliente;
	static ClienteHilo usuarios[] = new ClienteHilo[10];
	int maxUsuarios;
	PrintWriter salida;
	BufferedReader entrada;

	public ClienteHilo(Socket cliente, ClienteHilo t[]){
		this.cliente = cliente;
		this.usuarios = t;
		this.maxUsuarios = t.length;
	}

	public void run(){
		int i;
		try{
			salida = new PrintWriter(cliente.getOutputStream(), true);
			entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			String nickname;
			salida.println("Bienvenido al servidor de chat ");
			salida.println("Teclea un nickname ");
			nickname = entrada.readLine();
			
			for(i=0; i< maxUsuarios;i++){
				if(usuarios[i] != null && usuarios[i] != this){
					usuarios[i].salida.println("Se ha conectado un nuevo shiavo:" + nickname);
				}
			}

			while(true){
				String mensaje = entrada.readLine();
				if(mensaje.startsWith("/salir"))
					break;
				for(i=0; i< maxUsuarios;i++){
					if(usuarios[i] != null && usuarios[i] != this){
						usuarios[i].salida.println(nickname + " dice > " + mensaje);
					}
				}
			}

			salida.println("Adios.. shiavo");

			for(i=0; i< maxUsuarios;i++){
				if(usuarios[i] != null && usuarios[i] != this){
					usuarios[i].salida.println("Se nos fue el shiavo " + nickname);
				}
			}

			salida.close();
			entrada.close();

		}catch(IOException e){

		}

	}

}