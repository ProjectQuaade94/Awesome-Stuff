package UserInterface;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class GUI {
		
	public void frame(Object[][] content, Object[] top, int width, int height){

		JFrame window = new JFrame();
		JTable table = new JTable(content,top);
		JScrollPane scrollPane = new JScrollPane(table);
		window.setDefaultCloseOperation(3);
		window.add(scrollPane, BorderLayout.CENTER);
		window.isResizable();
		window.setSize(width, height);
		window.setVisible(true);
	}
	
	public int choices(String message,String title, String[] choices){
		int response = JOptionPane.showOptionDialog(
				null                         // Center in window.
				, message			         // Message
				, "Diablo 3 Calculator"      // Title in titlebar
				, JOptionPane.YES_NO_OPTION  // Option type
				, JOptionPane.PLAIN_MESSAGE  // messageType
				, null                       // Icon (none)
				, choices                    // Button text as above.
				,JOptionPane.YES_OPTION  						 // Default button's label
				);
		return response;
	}
	
}
