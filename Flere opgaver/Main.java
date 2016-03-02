

public class Main {
	public static void main(String[] args) {
		int n = 50000;

		alg3(n);
	}

	public static void alg3(int n){
		long startTid = System.currentTimeMillis()/1000;
		long lastTime=-1;
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
			long t = (slutTid-startTid);
			long ratio = t/lastTime;
			lastTime = t;
			System.out.println("n = " + n + " Tid i sek: " + t + " ratio: " +ratio);
			n = n*2;
			
		}
	}
}
