package UserInterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class GUI {
	
	private JFrame window = new JFrame();
//	private JTabbedPane display = new JTabbedPane();
//	private JPanel p = new JPanel();
//	private JButton bx = new JButton("Top left");
	
//	public void makeTab(String title){
//		p.setLayout(new BorderLayout());
//		p.setPreferredSize(new Dimension(200,100));
//		p.setBackground(Color.DARK_GRAY);
//		p.add(bx);
//		display.addTab(title, p);
//		window.add(display);
//		window.setLayout(new BorderLayout());
//		window.setPreferredSize(new Dimension(200,100));
//		window.setVisible(true);
//	}
	
	public void makeFrame(Object[][] content, Object[] top, int width, int height){
		
		JTable table = new JTable(content,top);
		JScrollPane scrollPane = new JScrollPane(table);
		window.setDefaultCloseOperation(3);
		window.add(scrollPane, BorderLayout.CENTER);
		window.isResizable();
		window.setSize(width, height);
		window.setVisible(true);
	}
	
	public int makeChoices(String message,String title, String[] choices){
		int response = JOptionPane.showOptionDialog(
				window                         // Center in window.
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
		int input = Integer.parseInt(JOptionPane.showInputDialog(window, message,title,JOptionPane.PLAIN_MESSAGE));
		return input;
	}

	public void makeWarning(String message, String title){
		JOptionPane.showMessageDialog(window,message,title,JOptionPane.ERROR_MESSAGE);
	}
	public void makeMessage(String message, String title){
		JOptionPane.showMessageDialog(window,message,title,JOptionPane.PLAIN_MESSAGE);

	}
	
}
