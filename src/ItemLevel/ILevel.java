package ItemLevel;
import java.lang.reflect.Array;

import javax.swing.JOptionPane;
public class ILevel {

	private static int response;
	private static String[] choices = {"One 2-Hander", "Two 1-Handers"};
	private static boolean twoh = false;




	public static void main(String[] args) {

		//	JOptionPane.showMessageDialog(null, "Item Level calculator, insert your gear here:");
		int wep1 = 0;
		int wep2 = 0;
		int head = Integer.parseInt(JOptionPane.showInputDialog("Head: "));
		int neck = Integer.parseInt(JOptionPane.showInputDialog("Neck: "));
		int shoulder = Integer.parseInt(JOptionPane.showInputDialog("Shoulder: "));
		int back = Integer.parseInt(JOptionPane.showInputDialog("Back: "));
		int chest = Integer.parseInt(JOptionPane.showInputDialog("Chest: "));
		int wrist = Integer.parseInt(JOptionPane.showInputDialog("Wrist: "));

		response = JOptionPane.showOptionDialog(
				null                       // Center in window.
				, "What are you using?"        // Message
				, ""               // Title in titlebar
				, JOptionPane.YES_NO_OPTION  // Option type
				, JOptionPane.PLAIN_MESSAGE  // messageType
				, null                       // Icon (none)
				, choices                    // Button text as above.
				, "Done"    // Default button's label
				);
		if(response == 1){
			wep1 = Integer.parseInt(JOptionPane.showInputDialog("Weapon 1: "));
			wep2 = Integer.parseInt(JOptionPane.showInputDialog("Weapon 2: "));

		}
		if (response == 0){
			wep1 = Integer.parseInt(JOptionPane.showInputDialog("Weapon: "));
			twoh = true;
		}
		else{
			JOptionPane.showMessageDialog(null, "Error, try again");
		}
		int trinket1 = Integer.parseInt(JOptionPane.showInputDialog("Trinket 1: "));
		int trinket2 = Integer.parseInt(JOptionPane.showInputDialog("Trinket 2: "));
		int ring1 = Integer.parseInt(JOptionPane.showInputDialog("Ring 1: "));
		int ring2 = Integer.parseInt(JOptionPane.showInputDialog("Ring 2: "));
		int feet = Integer.parseInt(JOptionPane.showInputDialog("Feet: "));
		int legs = Integer.parseInt(JOptionPane.showInputDialog("Legs : "));
		int waist = Integer.parseInt(JOptionPane.showInputDialog("Waist : "));
		int hands = Integer.parseInt(JOptionPane.showInputDialog("Hands : "));
		int[] ilvl = null;

		if(twoh == false){
			ilvl = new int[] {head,neck,shoulder,back,chest,wrist,wep1,wep2,trinket1,trinket2,ring1,ring2,feet,legs,waist,hands};
		}
		if(twoh == true){
			ilvl = new int[] {head,neck,shoulder,back,chest,wrist,wep1,trinket1,trinket2,ring1,ring2,feet,legs,waist,hands};
		}

		int ilvlsum = head+neck+shoulder+back+chest+wrist+wep1+wep2+trinket1+trinket2+ring1+ring2+feet+legs+waist+hands;
		int avilvl = ilvlsum/ilvl.length;
		JOptionPane.showMessageDialog(null, "Your average ilvl is: "+avilvl);
		
		JOptionPane.showMessageDialog(null, head+neck+shoulder+back+chest+wrist+wep1+wep2+trinket1+trinket2+ring1+ring2+feet+legs+waist+hands);
		
	}
}
