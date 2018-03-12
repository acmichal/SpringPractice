package pl.michalkr.springpractice;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Roach implements Animal {

	@Autowired
	@Qualifier("adaptationSpecialty")
	private Specialty specialty;

	@Override
	public String showHabitat() {
		return "anywhere";
	}

	
	@Override
	public String whatIsYourSpecialty() {
		return specialty.whatIsYourSpecialty();
	}
	
	@PostConstruct
	public void init() {
		System.out.println(specialty.whatIsYourSpecialty());
	}

}
