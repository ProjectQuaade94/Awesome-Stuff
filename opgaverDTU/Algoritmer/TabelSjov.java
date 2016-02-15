package Algoritmer;

public class TabelSjov {

	public static void main(String[] args) {


		System.out.println(tabelSjov());


	}

	public static boolean tabelSjov(){

		int A[] = {7,2,3,6,2,5,7,2,5,7,5,2,4};

		for(int i=0 ; i <= A.length-1 ; i++){
			for(int j=0 ; j <= A.length-1 ; j++){
				for(int k=0 ; k <= A.length-1 ; k++){
					if(A[i]+A[j]+A[k] == 0){
						return true;
					}
				}
			}
		}
		return false;
	}



}
