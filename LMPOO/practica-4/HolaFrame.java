import javax.swing.*;

public class HolaFrame extends JFrame{

	public static void main(String args[]){
		new HolaFrame();
	}

	public HolaFrame(){
		this.setSize(250, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Hola mundo");
		this.setVisible(true);
	}

}