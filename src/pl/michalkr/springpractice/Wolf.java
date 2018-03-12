package pl.michalkr.springpractice;

import org.springframework.stereotype.Component;

@Component
public class Wolf implements Animal {

	@Override
	public String showHabitat() {
		return "European forest";
	}

	@Override
	public String whatIsYourSpecialty() {
		return "I'm clever";
	}

}
