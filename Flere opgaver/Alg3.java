

public class Alg3 {

	public void alg3(int n){
		long startTid = System.currentTimeMillis()/1000;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				int k=j;
				while(k<=n){
					k=k*3;
					System.out.println("k = "+k);
				}
			}
		}
		long slutTid = System.currentTimeMillis()/1000;
		System.out.println("Tid i sek: "+(slutTid-startTid));
	}
}
