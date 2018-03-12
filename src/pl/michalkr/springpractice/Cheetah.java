package pl.michalkr.springpractice;

public class Cheetah implements Animal {

	Specialty mySpecialty;
	
	
	public Cheetah(Specialty mySpecialty) {
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
	
	public void initThisBean() {
		System.out.println("New cheetah born."); 
	}
	
	public void destroyThisBean() {
		System.out.println("Cheetah killed."); 
	}
	
	
}
