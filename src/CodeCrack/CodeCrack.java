package CodeCrack;

public class CodeCrack {

	private static String password;
	private static String tpassword = "";

	public static void main(String[] args) {

		password = "h";
		crackCode(password);
	}

	public static void crackCode(String password){
		for (int i = 0; i<10; i++){
			int index = 0;
			tpassword = tpassword + "a";
			for (char x = 'a'; x<='z';x++){
				
				tpassword.charAt(i);
				
				if(tpassword == password){
					System.out.print("Success, the password is: " + password);
				}
			}
		}

	}

}
