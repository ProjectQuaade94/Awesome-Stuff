package Algoritmer;

import java.util.ArrayList;

public class Findm {

	private int sum;
	private int m = -1;
	private int total;
	private boolean nul;

	public void algorithm(ArrayList<Integer> A , int n){

		for(int i = 0 ; i<n ; i++ ){

			//Da algoritmen ikke kan regne med 0, hiver vi 0 ud af 'A', men tjekker stadig at den findes.
			if(A.get(i)==0){
				A.remove(i);
				n--;
				nul = true;
			}
			if(A.get(i)==-1){
				//m skal være med, men værdien '-1' skal ikke bruges
			}
			else{
				sum = sum + (A.get(i));
			}
		}

		total = (n+1)*n/2;
		
		//finder m, men tjekker at det det ikke er 0 der mangler
		if(nul==true)
			m = total-sum;
		else
			m = 0;
		System.out.format("Det manglende tal er: %d", m);

	}


	public void findm(){

		ArrayList<Integer> A = new ArrayList<Integer>();

		A.add(1);
		A.add(6);
		A.add(2);
		A.add(4);
		A.add(m);
		A.add(5);
		A.add(7);
		A.add(3);

		int n = A.size();

		algorithm(A,n);

	}
}