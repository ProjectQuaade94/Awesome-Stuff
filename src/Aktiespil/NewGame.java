package Aktiespil;

import javax.swing.JOptionPane;

public class NewGame {
	
	private int response = -1;
	private String[] choices = {"Ja", "Nej"};
	private String message;
	private boolean sikker;

	public void newGame(){
		if(!sikker){
			sikker();
		}
		
		//indsæt null i txt fil metoden her
		
		
	}
	
	public void sikker(){
		
		message = "ADVARSEL!\n\nEr du sikker på at du vil starte et nyt spil?\n\nDu vil miste alle dine penge fra det tidligere spil!";
		response = JOptionPane.showOptionDialog(
				null                         // Center in window.
				, message			         // Message
				, "Aktie Spillet"      // Title in titlebar
				, JOptionPane.YES_NO_OPTION  // Option type
				, JOptionPane.PLAIN_MESSAGE  // messageType
				, null                       // Icon (none)
				, choices                    // Button text as above.
				,JOptionPane.YES_OPTION  						 // Default button's label
				);
		if (response == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		}
		if (response == 0){
			sikker = true;
			newGame();
		}
		if (response == 1){
			Controller C = new Controller();
			C.gameLoop();
		}
	}
	
}
