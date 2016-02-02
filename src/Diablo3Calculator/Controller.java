package Diablo3Calculator;

import javax.swing.JOptionPane;

public class Controller {

	private boolean loop = true;
	private int response = -1;
	private String[] choices = {"Gem Calculator", "Torment Difficulty", "Top Builds", "Versions"};
	private String message;


	public void programLoop(){

		while (loop) {
			message = "Welcome to Diablo 3 Calculator!\n\n- Designed and created by Lars Quaade\n\nChoose a service:";
			response = JOptionPane.showOptionDialog(
					null                         // Center in window.
					, message			         // Message
					, "Diablo 3 Calculator"      // Title in titlebar
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
				GemUpgrade GU = new GemUpgrade();
				GU.gemUpgrade();
			}
			if (response == 1){
				
				TormentDifficulty PC = new TormentDifficulty();
				PC.tormentDifficulty();
			}
			if (response == 2){
				Builds B = new Builds();
				B.builds();
			}
			if (response == 3){
				Versions V = new Versions();
				V.versions();
			}
		}
	}
}
