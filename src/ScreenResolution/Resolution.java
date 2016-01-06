package ScreenResolution;

import javax.swing.JOptionPane;

public class Resolution {
    public static void main(String[] args) {
    	
    	while(true){
    	
        //... Input
        String input = JOptionPane.showInputDialog(null, "This Program will determine how many pixels a screen must have in order for it to be retina\nWhat is the size of the desired screen?");
        double tommer = Double.parseDouble(input);
	
	//... Calculate
        double dpi = 120 * tommer;
	
	//... Output
        JOptionPane.showMessageDialog(null, "your screen must have " + (int)dpi + " pixels in order to be retina");
        }
    }
}
