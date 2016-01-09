package GaetEtTal;

public class Die {

	private int dice;

	// Rolls the die
	public void roll() {

			dice = (int) (Math.random() * 100) + 1;

	}
	
	/**
	 * Gets the number of the first dice rolled
	 * @return int
	 */
	public int getDice(){		
		return dice;
	}
	
}
