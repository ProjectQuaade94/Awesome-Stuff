package Diablo3Calculator;

import javax.swing.JOptionPane;

public class GemUpgrade {

	private int gemLevel;
	private String input;
	private int response = 0;
	private String[] choices = {"Enter new Gem level", "Exit", "Back"};
	private String message;
	private String[] chance = {null,null,null,null,null,null,null,null,null,null,null,null};
	private String chances = "";
	private int augment;
	private String augmentS1 = "Augmenting an item with this gem will give you ";
	private String augmentS2 = " Str/Dex/Int/Vit";

	public void gemUpgrade(){
		if (input == null){
			while(gemLevel<1){
				input = JOptionPane.showInputDialog(null, "Enter Gem level:");
				gemLevel = Integer.parseInt(input);
				augment = gemLevel*5;
				augmentS1 = augmentS1 + augment + augmentS2;
				if(gemLevel<1){
					JOptionPane.showMessageDialog(null,"The gem must be level 1 or above!");
				}
			}
		}

		int[] negCheck = {gemLevel+10,gemLevel+9,gemLevel+8,gemLevel+7,gemLevel+6,gemLevel-1,gemLevel-2,gemLevel-3,gemLevel-4,gemLevel-5,gemLevel-6};

		chance[0] = "\n100% at "+negCheck[0]+" and above";
		chance[1] = "\n90% at "+negCheck[1];
		chance[2] = "\n80% at "+negCheck[2];
		chance[3] = "\n70% at "+negCheck[3];
		chance[4] = "\n60% between levels "+gemLevel+" to "+negCheck[4];
		chance[5] = "\n30% at "+negCheck[5];
		chance[6] = "\n15% at "+negCheck[6];
		chance[7] = "\n8% at "+negCheck[7];
		chance[8] = "\n4% at "+negCheck[8];
		chance[9] = "\n2% at "+negCheck[9];
		chance[10] = "\n1% at "+negCheck[10];

		for(int i=0 ; i<11 ; i++){
			if(negCheck[i]>0){
				chances = chances + (chance[i]+"\n");
				
			}
		}

		message = "\nGem Level: "+gemLevel+ "\n"+"\nNB! This is for ONE gem upgrade only (add 2 Grift levels for higher/more chances)(3 if empowered)\nYour chances for an upgrade are as follows:\n" +chances+ "\n"+augmentS1;
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
		ifSent();
	}
	public void ifSent(){
		if (response == 0){
			GemUpgrade GU = new GemUpgrade();
			GU.gemUpgrade();
		}
		if (response == 1){
			System.exit(0);
		}
		if (response == 2){
		}
	}
}




