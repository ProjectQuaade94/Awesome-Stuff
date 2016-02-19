package NoteBlock;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class NewNote {

	private static String note;
	private static int number;

	public static void newNote(){
		note =	JOptionPane.showInputDialog(null, "Write your note here:");



		try {
			BufferedWriter writer = 
					new BufferedWriter ( new FileWriter(".\\test.txt"));
			
			
			writer.write(note);
			

			writer.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void newNumber(){
		number =	Integer.parseInt(JOptionPane.showInputDialog(null, "Write your note here:"));



		try {
			BufferedWriter writer = 
					new BufferedWriter ( new FileWriter(".\\test.txt"));
			
			
			writer.write(""+number);
			

			writer.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
