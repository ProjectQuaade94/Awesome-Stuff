package bmi;

import java.util.ArrayList;

public class Data implements IData {

	private class Person {
		String cpr;
		String navn;
		double hoejde;
		double vaegt;

		public Person(String cpr, String navn, double hoejde, double vaegt) {
			super();
			this.cpr = cpr;
			this.navn = navn;
			this.hoejde = hoejde;
			this.vaegt = vaegt;
		}
	}

	private ArrayList<Person> personer;

	public Data(){
		personer = new ArrayList<Person>();
		// Tilføj personer
		personer.add(new Person("234567­8901", "Ib Olsen", 1.80, 75.0));
		personer.add(new Person("456789­0123", "Ole Jensen", 1.75, 95.0));
		personer.add(new Person("123456­7890", "Eva Hansen", 1.65, 65.0));
	}
	//Returner personens navn
	@Override
	public String getNavn(String cpr){
		for (int i= 0; i< personer.size(); i++)
			if (personer.get(i).cpr.equals(cpr))
				return personer.get(i).navn;
		return null;
	}
	//Returner personens vægt
	@Override
	public double getVaegt(String cpr){
		for (int i= 0; i< personer.size(); i++)
			if (personer.get(i).cpr.equals(cpr))
				return personer.get(i).vaegt;
			return  -1;
	}
	//Returner personens højde
	@Override
	public double getHoejde(String cpr){
		for (int i= 0; i< personer.size(); i++)
			if (personer.get(i).cpr.equals(cpr))
				return personer.get(i).hoejde;
			return -1;
	}
}

