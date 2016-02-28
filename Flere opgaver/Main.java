

public class Main {
	public static void main(String[] args) {
		int n = 5000;

		alg3(n);
	}

	public static void alg3(int n){
		long startTid = System.currentTimeMillis()/1000;
		while(true){
			for(int i = 1; i <= n; i++){
				for(int j = 1; j <= n; j++){
					int k=j;
					while(k<=n){
						k=k*3;
					}
				}
			}
			long slutTid = System.currentTimeMillis()/1000;
			System.out.println("n = " + n + " Tid i min: " + ((slutTid-startTid)/60));
			n = n*2;
		}
	}
}
