package Alg5;

public class Hob {

	public static void main(String[] args) {

		int A[] = {10,6,3,2,1};
		int n = A.length;
		if(maxHobControl(A,n))
			System.out.println("Dette er en maxhob");
		else if(minHobControl(A,n))
			System.out.println("Dette er en minhob");
		else
			System.out.println("Dette er ikke en hob");
	}


	public static boolean maxHobControl(int[] A , int n){

		for(int count = 1, i = 0; i<n; i++, count++){
			if(i+count+1<n){
				if(A[i]<A[i+count]||A[i]<A[i+count+1]){
					return false;
				}
			}else if(i+count<n){
				if(A[i]<A[count]){
				return false;
				}
			}
		}

		return true;
	}
	
	private static boolean minHobControl(int[] A, int n) {

		for(int count = 1, i = 0; i<n; i++, count++){
			if(i+count+1<n){
				if(A[i]>A[i+count]||A[i]>A[i+count+1]){
					return false;
				}
			}else if(i+count<n){
				if(A[i]>A[count]){
				return false;
				}
			}
		}

		return true;
	}
}
