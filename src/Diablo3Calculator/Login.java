package Diablo3Calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login {

	public Hashtable<String, String> login(JFrame frame) {
	    Hashtable<String, String> logininformation = new Hashtable<String, String>();

	    JPanel panel = new JPanel(new BorderLayout(5, 5));

	    JPanel label = new JPanel(new GridLayout(0, 1, 2, 2));
	    label.add(new JLabel("Username", SwingConstants.RIGHT));
	    label.add(new JLabel("Password", SwingConstants.RIGHT));
	    panel.add(label, BorderLayout.WEST);

	    JPanel controls = new JPanel(new GridLayout(0, 1, 2, 2));
	    JTextField username = new JTextField();
	    controls.add(username);
	    JPasswordField password = new JPasswordField();
	    controls.add(password);
	    panel.add(controls, BorderLayout.CENTER);

	    JOptionPane.showMessageDialog(frame, panel, "login", JOptionPane.QUESTION_MESSAGE);

	    logininformation.put("user", username.getText());
	    logininformation.put("pass", new String(password.getPassword()));
	    return logininformation;
	}
	
}
