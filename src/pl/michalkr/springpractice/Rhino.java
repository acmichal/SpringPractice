package pl.michalkr.springpractice;

public class Rhino implements Animal {

	Specialty mySpecialty;
	
	
	public Rhino(Specialty mySpecialty) {
		this.mySpecialty = mySpecialty;
	}

	@Override
	public String showHabitat() {
		return "African savannah";
	}

	@Override
	public String whatIsYourSpecialty() {
		return mySpecialty.whatIsYourSpecialty();
	}

}
