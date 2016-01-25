package Diablo3Calculator;

import javax.swing.JOptionPane;

public class GemUpgrade {

	private double griftLevel;
	private double gemLevel;
	private String input;
	private boolean loop = true;
	private int response = 0;
	private String[] choices = {"Enter Gem level", "Enter Grift level", "Back"};
	private String message;
	
	public void gemUpgrade(){
			while (loop) {
				message = "Grift level: "+(int)griftLevel+"\nGem Level: "+(int)gemLevel+"\n\nEnter Gem and/or Grift level:";
				response = JOptionPane.showOptionDialog(
						null                         // Center in window.
						, message        // Message
						, "Diablo 3 Calculator"      // Title in titlebar
						, JOptionPane.YES_NO_OPTION  // Option type
						, JOptionPane.PLAIN_MESSAGE  // messageType
						, null                       // Icon (none)
						, choices                    // Button text as above.
						, ""    // Default button's label
						);
				if (response == 0){
					input = JOptionPane.showInputDialog(null, "Enter Gem level:");
					gemLevel = Double.parseDouble(input);
				}
				if (response == 1){
					input = JOptionPane.showInputDialog(null, "Enter Grift level:");
					griftLevel = Double.parseDouble(input);
				}
				if (response == 2){
					break;
				}
			}

}
	
}
