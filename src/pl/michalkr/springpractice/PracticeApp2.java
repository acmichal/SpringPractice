package pl.michalkr.springpractice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class PracticeApp2 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WildlifeConfig.class); 
		
		Animal myAnimal = context.getBean("anaconda", Animal.class);
		
		System.out.println(myAnimal.whatIsYourSpecialty());
		
		context.close();
	}

}
