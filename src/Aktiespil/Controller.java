package Aktiespil;

import javax.swing.JOptionPane;


public class Controller {

	private boolean loop = true;
	private int response = -1;
	private String[] choices = {"Nyt Spil", "Forts�t fra sidste spil", "Regler"};
	private String message;

	public void gameLoop(){

		while (loop) {
			message = "Velkommen til Aktie Spillet!\n\n- Opfundet og kodet af Lars Quaade S�rensen\n\nV�lg en af f�lgende mulighederne:";
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
				NewGame NG = new NewGame();
				NG.newGame();
			}
			if (response == 1){
				ContinueGame CG = new ContinueGame();
				CG.continueGame();
			}
			if (response == 2){
				Rules R = new Rules();
				R.rules();
			}
		}
	}
}
