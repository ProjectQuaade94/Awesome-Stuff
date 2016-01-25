package Diablo3Calculator;

import javax.swing.JOptionPane;

public class GemUpgrade {

	private double griftLevel;
	private double gemLevel;
	private String input;
	
	public void gemUpgrade(){
		input = JOptionPane.showInputDialog(null, "Enter Gem level");
		griftLevel = Double.parseDouble(input);
}
	
}
