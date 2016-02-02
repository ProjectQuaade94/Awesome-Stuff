package Diablo3Calculator;

import javax.swing.JOptionPane;

public class Versions {

	private String message;
	private String v1;
	private String v2;
	private String v3;
	private String v4;
	private String v5;

	
	public void versions(){
		
		v1 = "\n1.0.0\n- Creation of Basic Gem Calculator\n- Creation of Paragon Calculator\n";
		v2 = "\n1.0.1\n- Changes Calculator so it does not account for 3 tries, but only 1\n   (This makes it easier to use since you can simply just add 2 or 3 levels to your Grift)\n- Bug fixes\n";
		v3 = "\n1.1.0\n- Removal of Paragon Calculator (pointless compared to effort)\n- Creation of Torment Difficultly\n- Improved structure in code\n- Bug fixes\n";
		v4 = "\n1.2.0\n- Creation of Versions (Watch as the program develops!)\n- Added Teaser for 'Builds'\n- Added sentence for Augmenting gem into gear in the Gem Calculator\n";
		v5 = "\n1.2.1\nBugs in GUI:\n- Removed the annoying small window\n- The main windows can now be closed with the 'x' button\n- removed the 'Exit' buttons";		
		message = "\nVersions:\n"+v1+v2+v3+v4+v5;
		JOptionPane.showMessageDialog(null,message);
	}
}
