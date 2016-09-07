import javax.swing.*;

public class HolaPanel extends JFrame{

	public static void main(String args[]){
		new HolaPanel();
	}

	public HolaPanel(){
		this.setSize(450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Hola mundito");
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Hola mundito");
		JButton boton = new JButton("Botoncito");

		boton.setToolTipText("Este es un boton");

		panel.add(label);
		panel.add(boton);
		this.add(panel);

		this.setVisible(true);
	}

}