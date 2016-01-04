package WouldYouRather;

import javax.swing.JOptionPane;

public class WouldYouRatherGame {

	private static String[] NameArray = {"name0","name1"};
	private static int n=-1;
	private static String[] choices = {"B", "A","Finish"};

	public static void main(String[] args) {

		boolean loop = true;
		int response = 0;
		int question = -1;
		String Q[] = {null,null,null};
		String Ans[] = {"X","X","X","X","X","X"};
		int turn = 0;

		Q[0] = "A : Stop using Youtube\nB : Stop using Facebook";
		Q[1] = "A : Communicate with Animals\nB : Speak every language fluently";
		Q[2] = "A : A zombie apocalypse\nB : An alien invasion";

		while(n<1){
			n++;
			NameArray[n] = JOptionPane.showInputDialog(null, "Enter your name:");

			while (loop == true) {
				if(question >= 2){
					loop = false;
				}
				else{
					response = JOptionPane.showOptionDialog(
							null                       // Center in window.
							, Q[question+1]        // Message
									, "Would you rather?"               // Title in titlebar
									, JOptionPane.YES_NO_OPTION  // Option type
									, JOptionPane.PLAIN_MESSAGE  // messageType
									, null                       // Icon (none)
									, choices                    // Button text as above.
									, "Done"    // Default button's label
							);
					question++;

					if (response == 0){
						Ans[question+turn] = "B";
					}

					else if (response == 1){
						Ans[question+turn] = "A";
					}

					else if (response == 2){
						loop = false;
						break;
					}
				}
			}

			JOptionPane.showMessageDialog(null, NameArray[n]+ " answered the following:\n"
					+ "\n"+ Q[0]+"\n"+NameArray[n]+" answered: " + Ans[0]+"\n"
					+ "\n"+ Q[1]+"\n"+NameArray[n]+" answered: " + Ans[1]+"\n"
					+ "\n"+ Q[2]+"\n"+NameArray[n]+" answered: " + Ans[2]+"\n"
					);	
			loop = true;
			turn = 3;
			question = -1;
			response = 0;

		}

		String a = "You both agree on this:";
		String d = "You both diagree on this:";
		String ag1 = null;
		String ag2 = null;
		String ag3 = null;



		if(Ans[0]==Ans[3]){ag1 = a;} if (Ans[0]!=Ans[3]){ag1 = d;}
		if(Ans[1]==Ans[4]){ag2=a;} if (Ans[1]!=Ans[4]){ag2 = d;}
		if(Ans[2]==Ans[5]){ag3=a;} if (Ans[2]!=Ans[5]){ag3 = d;}



		JOptionPane.showMessageDialog(null, NameArray[0]+" and "+NameArray[1]+ " answered the following:\n"

		+ "\n"+ag1+ "\n"+ Q[0]+"\n"+NameArray[0]+" answered: " + Ans[0]+"\n"
		+ "\n"+ag2+ "\n"+ Q[1]+"\n"+NameArray[0]+" answered: " + Ans[1]+"\n"
		+ "\n"+ag3+ "\n"+ Q[2]+"\n"+NameArray[0]+" answered: " + Ans[2]+"\n"
		+ "\n"+ag1+ "\n"+ Q[0]+"\n"+NameArray[1]+" answered: " + Ans[3]+"\n"
		+ "\n"+ag2+ "\n"+ Q[1]+"\n"+NameArray[1]+" answered: " + Ans[4]+"\n"
		+ "\n"+ag3+ "\n"+ Q[2]+"\n"+NameArray[1]+" answered: " + Ans[5]+"\n"
				);
	}
}