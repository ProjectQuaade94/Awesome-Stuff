package Opgave1;

import java.util.Arrays;

public class Stak_tabel implements Stak{

	private int arraySize = 5;
	private String[] data = new String[arraySize];
	private String deleted;

	
	@Override
	public void push(String e) {
		
		if(data.length <= arraySize){
			
			for(int i = 0; i<arraySize;i++){
				if(data[i]==null){
				data[i] = e;
				break;
				}
			}
		}
	}

	@Override
	public String pop() {
		for(int i = 4 ; i>-1 ; i--){
			
			if (data[i] != null){
				deleted = data[i];
				data[i] = null;
				break;
			}
		}
		return deleted;
	}

	@Override
	public boolean tom() {
			return (data.length == 0);
	}

	@Override
	public boolean fuld() {
		if (data.length == arraySize){
			return true;
		}else{
		return false;
		}
	}

	@Override
	public void vis() {
		System.out.println(Arrays.toString(data));
	}
	
}