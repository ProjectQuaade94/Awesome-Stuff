package Alg5;

import java.util.ArrayList;

public class Hob {
	
	private static ArrayList<Integer> batch = new ArrayList<Integer>();
	private static ArrayList<Integer> weight = new ArrayList<Integer>();
	private static ArrayList<String> name = new ArrayList<String>();
	

	public static void main(String[] args) {
//
//		int A[] = {824,6, 10, 6,485,253,103,89,76,33,43,12,2,6};
//		int n = A.length;
//		if(maxHobControl(A,n))
//			System.out.println("Dette er en maxhob");
//		else if(minHobControl(A,n))
//			System.out.println("Dette er en minhob");
//		else
//			System.out.println("Dette er ikke en hob");
		Data();
		for(int i = 0; i<batch.size();i++){
			System.out.println(batch.get(i));
			System.out.println(weight.get(i));
			System.out.println(name.get(i)+"\n");

		}
	}
	public static void Data(){
		for(int i = 0; i<10; i++){
		batch.add(i);
		weight.add((i+5)*7);
		String s="";
		
		char x = 'a';
		for (int j = 0; j<9; j++,x++){
		s=s+x;
		}
		name.add(s);
		}
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
