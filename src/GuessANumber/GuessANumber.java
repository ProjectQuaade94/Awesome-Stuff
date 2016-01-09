package GuessANumber;

import javax.swing.JOptionPane;

public class GuessANumber {

	public static void main(String[] args) {

		int input2 = 0;
		String inputx = null;
		String input1 = null;
		//No range above 9000!
		int range = 0;
		int turns = 1;
		long time1;
		long time2;
		long timeSum;
		long timeMins;
		long timeSecs;
		int response = 0;
		int nr = 0;
		String[] choices = {"Impossible! [1-1000]", "Veteran [1-200]", "Expert [1-100]","Normal [1-10]"};
		String difficulty = null;

		JOptionPane.showMessageDialog(null,"\nWelcome to 'Guess the number' ©\n\n- Designed and created by Lars Quaade Sørensen");
		
		//Insert Name
		while (input1==null ||input1==""||input1.length()<3){
			inputx = JOptionPane.showInputDialog(null, "Hello there friend!\n\nPlease enter your name below:");
			//Name to uppercase
			input1 = inputx.substring(0, 1).toUpperCase() + inputx.substring(1);
		}
		//Rules
		JOptionPane.showMessageDialog(null,"Nice to meet you "+input1+"!\n\nThe rules are simple:\n\nI am thinking of a number, and you must guess it in as few turns as possible\n");
		
		//Insert difficulty
		response = JOptionPane.showOptionDialog(
				null                       // Center in window.
				, "\nDifficulty Settings:\n\n"+input1+", please select the difficultly level that best suits you:\n"       // Message
				, "Guess the number"               // Title in titlebar
				, JOptionPane.YES_NO_OPTION  // Option type
				, JOptionPane.PLAIN_MESSAGE  // messageType
				, null                       // Icon (none)
				, choices                    // Button text as above.
				, "Done"    // Default button's label
				);
		//Hardest first:
		if(response==0){
			range = 1000;	
			difficulty = choices[0];
			nr = (int) (Math.random() * range) + 1;
			input2 = Integer.parseInt(JOptionPane.showInputDialog("\nYou are insane! now guess a number between 1 and "+range));
		}
		if(response==1){
			range = 200;
			difficulty = choices[1];
			nr = (int) (Math.random() * range) + 1;
			input2 = Integer.parseInt(JOptionPane.showInputDialog("\nYou got nerves, now guess a number between 1 and "+range));
		}
		if(response==2){
			range = 100;
			difficulty = choices[2];
			nr = (int) (Math.random() * range) + 1;
			input2 = Integer.parseInt(JOptionPane.showInputDialog("\nI like a challenger, now guess a number between 1 and "+range));
		}
		if(response==3){
			range = 10;
			difficulty = choices[3];
			nr = (int) (Math.random() * range) + 1;
			input2 = Integer.parseInt(JOptionPane.showInputDialog("\nWise choice, now guess a number between 1 and "+range));
		}
		if(range<10){
			JOptionPane.showMessageDialog(null,"Something fucked up, closing program..");
			System.exit(0);
		}
		//Game start
		time1 = System.currentTimeMillis();
		while(input2 != nr){
			if(input2 > nr && input2 < (range+1)){
				input2 = Integer.parseInt(JOptionPane.showInputDialog(null, "\nLower!\n\nDifficulty: "+difficulty+"\nYou have spent: "+turns+" turns.\n\nGuess again:"));
			}
			else if(input2 < nr && input2 < (range+1)){
				input2 = Integer.parseInt(JOptionPane.showInputDialog(null, "\nHigher!\n\nDifficulty:"+difficulty+"\nYou have spent: "+turns+" turns.\n\nGuess again:"));
			}
			else if(input2 > range && input2 <= 9000 ){
				input2 = Integer.parseInt(JOptionPane.showInputDialog(null, input1 + ", that number is not between 1 and "+range+"...\n\nGuess again:"));
			}
			else if(input2 > 9000){
				JOptionPane.showMessageDialog(null, "Error 404: Page not found!/n/nJust kidding, this level doesn't exist, yet..");
				System.exit(0);
			}
			turns++;
		}
		time2 = System.currentTimeMillis();
		timeSum = ((time2-time1)/1000);
		timeMins = timeSum/60;
		timeSecs = timeSum-(timeMins*60);
		//Game endings
		if(turns <= 3){
			JOptionPane.showMessageDialog(null, "CONGRATULATIONS! YOU WIN!\n\nYou spent " + turns + " turns"+"\nNice score! :)\n\nGame Time: "+timeMins+" minutes and "+timeSecs+" seconds");
			System.exit(0);
		}
		if(turns > 3 && turns < 20){
			JOptionPane.showMessageDialog(null, "Congratulations! You Win!\n\nYou spent " + turns + " turns"+"\nTry again to get a score in 3 or less turns! :)\n\nGame Time: "+timeMins+" minutes and "+timeSecs+" seconds");
			System.exit(0);
		}
		if(turns >= 20){
			JOptionPane.showMessageDialog(null, "You Win!\n\nYou spent " + turns + " turns"+"\nYou spent a lot of turns! Try to get a better score!\n\nGame Time: "+timeMins+" minutes and "+timeSecs+" seconds");
			System.exit(0);
		}
	}
}
