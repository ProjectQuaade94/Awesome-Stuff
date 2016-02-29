package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {

	public static void main(String[] args) {

		JFrame f = new JFrame("Hello");
		JPanel p = new JPanel();
		JButton b = new JButton("press me!");
		
		p.add(b);
		f.setContentPane(p);
		f.pack();
		f.setVisible(true);
		
		
		
		
		
	}

	
	
	
	
}
