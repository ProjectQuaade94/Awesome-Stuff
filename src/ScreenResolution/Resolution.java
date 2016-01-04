package ScreenResolution;

import javax.swing.JOptionPane;

public class Resolution {
    public static void main(String[] args) {
    	
    	while(true){
    	
        //... Input
        String input = JOptionPane.showInputDialog(null, "What is the size of the desired screen?");
        double tommer = Double.parseDouble(input);
	
	//... Calculate
        double dpi = 120 * tommer;
	
	//... Output
        JOptionPane.showMessageDialog(null, "your screen must have " + (int)dpi + " pixels in order to be retina");
        }
    }
}
