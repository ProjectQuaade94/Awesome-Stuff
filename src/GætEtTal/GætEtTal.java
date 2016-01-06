package GætEtTal;

import javax.swing.JOptionPane;

public class GætEtTal {

	private  static int input2;
	private static String input1;
	//No range above 9000!
	private static int range = 100;
	private static int nr = (int) (Math.random() * range) + 1;
	private static int turns = 1;
	private static long time1;
	private static long time2;
	private static long timeSum;
	private static long timeMins;
	private static long timeSecs;

	public static void main(String[] args) {
		time1 = System.currentTimeMillis();
		input1 = JOptionPane.showInputDialog(null, "What is your name?");

		input2 = Integer.parseInt(JOptionPane.showInputDialog(input1 + ", guess a number between 1 and "+range));
		
		while(input2 != nr){
			if(input2 > nr && input2 < (range+1)){
						input2 = Integer.parseInt(JOptionPane.showInputDialog(null, "No "+input1+" Lower!"));
			}
			else if(input2 < nr && input2 < (range+1)){
						input2 = Integer.parseInt(JOptionPane.showInputDialog(null, "No "+input1+" Higher!"));
			}
			else if(input2 > range && input2 <= 9000 ){
				input2 = Integer.parseInt(JOptionPane.showInputDialog(null, input1 + ", that number is not between 1 and "+range+"..."));
			}
			else if(input2 > 9000){
				JOptionPane.showMessageDialog(null, "ERROR, the number you have entered is over 9000!\nThe amount of awesomeness is too much for this program, you win...");
				System.exit(0);
			}
			turns++;
		}
		time2 = System.currentTimeMillis();
		timeSum = ((time2-time1)/1000);
		timeMins = timeSum/60;
		timeSecs = timeSum-(timeMins*60);
		
		if(turns <= 3){
		JOptionPane.showMessageDialog(null, "CONGRATULATIONS! YOU WIN!\nYou spent " + turns + " turns"+"\nNice score! :)\n\nGame Time: "+timeMins+" minutes and "+timeSecs+" seconds");
		System.exit(0);
		}
		if(turns > 3 && turns < 20){
			JOptionPane.showMessageDialog(null, "You win!\nYou spent " + turns + " turns"+"\nTry again to get a better score! :)\n\nGame Time: "+timeMins+" minutes and "+timeSecs+" seconds");
			System.exit(0);
		}
		if(turns >= 20){
			JOptionPane.showMessageDialog(null, "You win!\nYou spent " + turns + " turns"+"\nYou really spent a lot of turns!\n\nGame Time: "+timeMins+" minutes and "+timeSecs+" seconds");
			System.exit(0);
		}
	}
}
