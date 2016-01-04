package Aktiespil;


public class RandomGenerator {

private int rand;
	
	public void roller(){
	
	rand = (int) (Math.random() * 6) + 1;

}

public int getRandomNr(){
	
	return rand;
}
}