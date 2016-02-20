package Aktiespil;

import javax.swing.JOptionPane;

public class Rules {

	private String message;
	
	public void rules(){
		
		message = "Regler for Aktie Spil:\n\n- Du starter med en pengebeholdning på 50,000 DKK.\n- Det er din opgave at investere i de rigtige aktier for\n   at tjene flest penge.\n- Du taber hvis din pengebeholdning falder under 10,000 DKK\n- Du vinder med en pengebeholdning på 100,000 DKK\n";
		
		JOptionPane.showMessageDialog(null,message);
		
	}
	
}
