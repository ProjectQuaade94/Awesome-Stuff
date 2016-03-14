package Controller;

import javax.swing.JOptionPane;

import Data.Builds;
import Data.TormentReward;
import Data.Versions;
import Funktionality.GemUpgrade;
import UserInterface.GUI;


public class Controller {

	private String message;
	private String title;
	private int response;
	private String[] choices = {"Gem Calculator", "Torment Difficulty", "Top Builds", "Versions"};

	private GUI G;
	private GemUpgrade GU;
	private TormentReward TR;
	private Builds B; 
	private Versions V;

	public Controller(){

		G = new GUI();
		GU = new GemUpgrade(G);
		TR = new TormentReward();
		B = new Builds();
		V = new Versions();
	}

	public void programLoop(){
		
		message = "Welcome to D3Calc (Alfa)\n\n- Designed and created by Lars Quaade\n\nChoose a service:";
		title = "Diablo 3 Calculator";
		response = G.makeChoices(message, title, choices);

		if (response == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		}
		if (response == 0){
			GU.gemUpgrade();
			response = -1;
		}
		if (response == 1){
			G.makeFrame(TR.getContent(), TR.getHeader(), 1200, 300);
			response = -1;
		}
		if (response == 2){
			G.makeFrame(B.getContent(), B.getHeader(), 1200, 300);
			response = -1;
		}
		if (response == 3){
			G.makeMessage(V.getVersion(), "Verison");
			response = -1;
		}
	}
}