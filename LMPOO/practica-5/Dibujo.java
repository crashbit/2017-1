import java.awt.*;
import javax.swing.JFrame;

public class Dibujo extends Canvas{
	public static void main(String args[]){
		JFrame marco = new JFrame("Mi dibujo");
		Canvas lienzo = new Drawing();
		lienzo.setSize(400, 400);
		marco.add(lienzo);
		marco.pack();
		marco.setVisible(true);
	}

	public void paint(Graphics g){
		g.fillOval(100, 100, 200, 200);
	}

}

