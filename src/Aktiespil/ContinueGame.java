package Aktiespil;

import javax.swing.JOptionPane;

public class ContinueGame {

	public void continueGame(){
		
		oldGameCheck();
		
	}
	
	public void oldGameCheck(){
		
		File F = new File();
		if(F.isEmpty()){
		JOptionPane.showMessageDialog(null,"No data from previous games found!");
		}
	}
	
}
