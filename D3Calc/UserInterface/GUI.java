package UserInterface;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class GUI {

	private JFrame f = new JFrame("Java Evil Edition");

	public void ImageHolder(){
    ImageIcon image = new ImageIcon ("chart1.png"); // Creates the image
    JLabel label = new JLabel (image); // add the image to the label
    f.add(label); //add the label to the frame
    f.setSize(250,340);
    f.setVisible(true);
    }


	public void makeFrame(Object[][] content, Object[] top, int width, int height){

		JTable table = new JTable(content,top);
		JScrollPane scrollPane = new JScrollPane(table);
		f.setDefaultCloseOperation(3);
		f.add(scrollPane, BorderLayout.CENTER);
		f.isResizable();
		f.setSize(width, height);
		f.setVisible(true);
	}

	public int makeChoices(String message,String title, String[] choices){
		int response = JOptionPane.showOptionDialog(
				f                         // Center in window.
				, message			         // Message
				, title      // Title in titlebar
				, JOptionPane.YES_NO_OPTION  // Option type
				, JOptionPane.PLAIN_MESSAGE  // messageType
				, null                       // Icon (none)
				, choices                    // Button text as above.
				,JOptionPane.YES_OPTION  						 // Default button's label
				);
		return response;
	}

	public int getIntInput(String message, String title){
		String g = JOptionPane.showInputDialog(f, message,title,JOptionPane.PLAIN_MESSAGE);
		int i = JOptionPane.CANCEL_OPTION;
		int input = Integer.parseInt(g);
		System.out.println(i);
		return input;
	}
	public void makeWarning(String message, String title){
		JOptionPane.showMessageDialog(f,message,title,JOptionPane.ERROR_MESSAGE);
	}
	public void makeMessage(String message, String title){
		JOptionPane.showMessageDialog(f,message,title,JOptionPane.PLAIN_MESSAGE);
	}
}
