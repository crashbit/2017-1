import javax.swing.*;
import java.awt.event.*;

public class EscuchaBoton extends JFrame implements ActionListener{

	public static void main(String args[]){
		new EscuchaBoton();
	}

	private JButton boton1;
	private int cuentaClicks = 0;

	public EscuchaBoton(){

		this.setSize(450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Hola botoncito");

		JPanel panel = new JPanel();
		boton1 = new JButton("Click please!!");
		boton1.addActionListener(this);

		panel.add(boton1);
		this.add(panel);

		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1){
			cuentaClicks++;
			if(cuentaClicks == 1){
				boton1.setText("Me han hecho click");			
			}
			else{
				boton1.setText("me han hecho " + cuentaClicks + " clicks");
			}
		}	
	}

}








