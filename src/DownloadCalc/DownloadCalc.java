package DownloadCalc;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DownloadCalc {

	private int time;
	private int speed;
	private int size;
	private String m;
	private JFrame f = new JFrame();

	public void dow(){
		speed = getIntInput("Insert your internet speed in Mb/s: ","Download Speed Calculator");
		size = getIntInput("Insert the file size in MB: ","Download Speed Calculator");
		
		speed = speed/8;
		time = calc(speed,size);
		
		m = "Your download will take: "+time+" minutes, with a speed of: "+speed+"MB/s";
		makeMessage(m,"Download Speed Calculator");
		
	}
	
	public int calc(int speed, int size){
		
		time = size/speed;
		return time;
	}
	
	public int getIntInput(String message, String title){
		String g = JOptionPane.showInputDialog(f, message,title,JOptionPane.PLAIN_MESSAGE);
		int i = JOptionPane.CANCEL_OPTION;
		int input = Integer.parseInt(g);
		System.out.println(i);
		return input;
	}
	
	public void makeMessage(String message, String title){
		JOptionPane.showMessageDialog(f,message,title,JOptionPane.PLAIN_MESSAGE);
	}
}
