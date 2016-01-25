package Diablo3Calculator;

import javax.swing.JFrame;

public class Main {


	public static void main(String[] args) {
		  JFrame window = new JFrame();                           //Note 2
	        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Note 3
	        window.setVisible(true);   
		
		Controller C = new Controller();
		C.programLoop();
	}


}
