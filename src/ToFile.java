import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ToFile {

	public static void main(String[] args) {

		String s = "save me";
		
		try {
			BufferedWriter writer = 
					new BufferedWriter ( new FileWriter(".\\test.txt"));
			
			writer.write(s);
			
			writer.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
