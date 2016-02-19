package NoteBlock;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ViewNotes {
	
	private static String note;
	
	public static void viewNotes(){
		
		try {
		
		BufferedReader reader =
				new BufferedReader (new FileReader (".\\test.txt"));
		
		note = reader.readLine();
		
		reader.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	if(note==null)
	JOptionPane.showMessageDialog(null,"You have no notes!");
	else
	JOptionPane.showMessageDialog(null,"Your notes:\n\n"+note);

	}
	
}
