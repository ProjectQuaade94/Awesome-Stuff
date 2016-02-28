package Aktiespil;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class NewGame {

	ChoicePanel CP = new ChoicePanel();
	private boolean sikker;
	private String message;
	private ArrayList<String> choices;
	private int response;

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
			
			choices.add("Nyt Spil");
			choices.add("Fortsæt spil");
			choices.add("Regler");
			response = CP.choicePanel("Aktie Spillet", message, choices);
			
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
