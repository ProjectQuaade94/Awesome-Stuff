package Data;

import javax.swing.JOptionPane;

public class Builds {

	private Object[] header = {"Crusader", "Demon Hunter", "Witch Doctor", "Monk", "Wizard", "Barbarian"};

	private Object[][] content = {};


	public void builds(){

		String message = "Coming Soon!";
		JOptionPane.showMessageDialog(null,message);


	}


	public Object[][] getContent() {
		return content;
	}


	public Object[] getHeader() {
		// TODO Auto-generated method stub
		return header;
	}
}
