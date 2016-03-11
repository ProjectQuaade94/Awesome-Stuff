package Diablo3Calculator;

import javax.swing.JOptionPane;

public class Controller {

	private String message;
	private String title;
	private int response;
	private String[] choices = {"Gem Calculator", "Torment Difficulty", "Top Builds", "Versions"};

	private GUI G;
	private GemUpgrade GU;
	private TormentDifficulty PC;
	private Builds B; 
	private Versions V;

	public Controller(){

		G = new GUI();
		GU = new GemUpgrade(G);
		PC = new TormentDifficulty();
		B = new Builds();
		V = new Versions();

		message = "Please make a choice:";
		title = "Diablo 3 Calculator";
		response = G.choices(message, title, choices);

	}

	public void programLoop(){

		if (response == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		}
		if (response == 0){
			GU.gemUpgrade();
		}
		if (response == 1){

			PC.tormentDifficulty();
		}
		if (response == 2){
			B.builds();
		}
		if (response == 3){
			V.versions();
		}
	}
}