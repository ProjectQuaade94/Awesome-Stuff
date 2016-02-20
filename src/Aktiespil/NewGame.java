package Aktiespil;

import javax.swing.JOptionPane;

public class NewGame {

	private int response = -1;
	private String[] choices = {"Ja", "Nej"};
	private String message;
	private boolean sikker;

	public void newGame(){
		File F = new File();
		if(!F.isEmpty()){
		sikker();
		}
		F.setData(50000);
		JOptionPane.showMessageDialog(null,"You start with 50,000 DKK!\n\nGood Luck!\n");
		System.out.print(F.getData());
		Game G = new Game();
		G.game();
	}

	public void sikker(){
		if(!sikker){

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

}
