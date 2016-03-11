package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {

	public static void main(String[] args) {

		JFrame f = new JFrame("Hello");
		JPanel p = new JPanel();
		JButton b1 = new JButton("press me!");
		JButton b2 = new JButton("press me!");
		
		p.add(b1);
		p.add(b2);
		f.setContentPane(p);
		f.pack();
		f.setVisible(true);
		
		
		
		
		
	}

	
	
	
	
}
