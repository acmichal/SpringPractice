package pl.michalkr.springpractice;

import java.util.Random;

public class HuntingSpecialty implements Specialty {

	String[] specialtyArray = {"I run fast.", "I have a good sense of smell","I'm smart"};
	@Override
	public String whatIsYourSpecialty() {
		int rnd = new Random().nextInt(specialtyArray.length);
		return specialtyArray[rnd];
	}

}
