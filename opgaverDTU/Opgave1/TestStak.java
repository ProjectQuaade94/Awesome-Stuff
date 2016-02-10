package Opgave1;

public class TestStak {

	public static void main(String[] args) {

		Stak Stak = new Stak_tabel();
		
		Stak.push("Dette");
		Stak.push("er");
		Stak.push("en");
		Stak.push("meget");
		Stak.pop();
		Stak.push("mærkelig");
		Stak.push("sætning");
		Stak.vis();
	}

}
