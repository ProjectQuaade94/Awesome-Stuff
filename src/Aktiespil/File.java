package Aktiespil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {

	private int data;
	private String isEmpty;
	
	public void setData(int data){

		try {
			BufferedWriter writer = 
					new BufferedWriter ( new FileWriter(".\\Data.txt"));
			
			writer.write(""+data);
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int getData(){
		
		try {
		BufferedReader reader =
				new BufferedReader (new FileReader (".\\Data.txt"));
		
		isEmpty = reader.readLine();
		data = Integer.parseInt(reader.readLine());
		reader.close();
		
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
	
	public boolean isEmpty(){
		if(isEmpty==null){
		return true;
		}
		else{
			return false;
		}
	}
	
}
