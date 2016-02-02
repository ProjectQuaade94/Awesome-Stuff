package Diablo3Calculator;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Controller {

	private boolean loop = true;
	private int response = 0;
	private String[] choices = {"Gem Calculator", "Torment Difficulty", "Top Builds", "Versions", "Exit"};
	private String message;


	public void programLoop(){
		
		  JFrame window = new JFrame();
	        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        window.setVisible(true);   
		
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
					, ""    // Default button's label
					);
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
			if (response == 4){
				System.exit(0);
			}
		}
	}
}
