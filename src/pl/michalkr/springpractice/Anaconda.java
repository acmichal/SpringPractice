package pl.michalkr.springpractice;

public class Anaconda implements Animal {
	
	private Specialty specialty;
	
	public Anaconda(Specialty theSpecialty) {
		specialty = theSpecialty;
	}

	@Override
	public String showHabitat() {
		return "Jungle";
	}

	@Override
	public String whatIsYourSpecialty() {
		return specialty.whatIsYourSpecialty();
	}

}
