package Aktiespil;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ChoicePanel {

	private int response = -1;
	String[] choice;

	public int choicePanel(String title, String message, ArrayList<String> choices){
		for(int i = 0; i<choices.size(); i++){
		choice[i] = choices.get(i);
		}
		response = JOptionPane.showOptionDialog(
				null                         // Center in window.
				, message			         // Message
				, title     				 // Title in titlebar
				, JOptionPane.YES_NO_OPTION  // Option type
				, JOptionPane.PLAIN_MESSAGE  // messageType
				, null                       // Icon (none)
				, choice                     // Button text as above.
				,JOptionPane.YES_OPTION  	 // Default button's label
				);
		if (response == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		}
		return response;
	}
}
