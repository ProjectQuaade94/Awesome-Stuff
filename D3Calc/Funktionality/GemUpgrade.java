package Funktionality;

import javax.swing.JOptionPane;

import UserInterface.GUI;


public class GemUpgrade {

	private int gemLevel = -1;
	private int response = 0;
	private String choices[] = {"Enter new Gem level", "Back"};
	private String message;
	private String title;
	private String chance[] = {null,null,null,null,null,null,null,null,null,null,null};
	private String chances= "";
	private int augment;
	private String augmentS1 = "Augmenting an item with this gem will give you ";
	private String augmentS2 = " Str/Dex/Int/Vit";
	private GUI G;

	public GemUpgrade(GUI G) {
		this.G = G;
	}

	public void gemUpgrade(){
		while(gemLevel<0){
			try{
				gemLevel = G.getIntInput("Enter gem level: ","GemCalc");
			}catch(java.lang.NumberFormatException e){
				G.makeWarning("Input must be a number!","Error");
			}
			if(gemLevel<0 && gemLevel != -1){
				G.makeWarning("The gem must be level 0 or above!","Error");
			}
		}


		augment = gemLevel*5;
		augmentS1 = augmentS1 + augment + augmentS2;

		int[] negCheck = {gemLevel+10,gemLevel+9,gemLevel+8,gemLevel+7,gemLevel+6,gemLevel-1,gemLevel-2,gemLevel-3,gemLevel-4,gemLevel-5,gemLevel-6};
		chances = "";
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

		for(int i=0 ; i<chance.length ; i++){
			if(negCheck[i]>=0){
				chances = chances + (chance[i]+"\n");
			}
		}
		title = "Gem Calculator";
		message = "\nGem Level: "+gemLevel+ "\n"+"\nNB! This is for ONE gem upgrade only (add 2 Grift levels for higher/more chances)(3 if empowered)\nYour chances for an upgrade are as follows:\n" +chances+ "\n"+augmentS1;
		response = G.makeChoices(message, title, choices);

		if (response == JOptionPane.CLOSED_OPTION){
			System.exit(0);
		}
		if (response == 0){
			gemLevel = -1;
			gemUpgrade();
		}
		if (response == 1){
		}
	}
}