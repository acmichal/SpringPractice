package pl.michalkr.springpractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myContext.xml");
		
        Animal myAnimal = context.getBean("myPracticeAnimal", Animal.class);
        Animal myAnimal2a = context.getBean("myPracticeAnimal2", Animal.class);
        Animal myAnimal2b = context.getBean("myPracticeAnimal2", Animal.class);
        Animal myAnimal3 = context.getBean("wolf", Animal.class);
        Animal myAnimal4 = context.getBean("roach", Animal.class);
        
        System.out.println(myAnimal.showHabitat());
        System.out.println(myAnimal.whatIsYourSpecialty());
        System.out.println(myAnimal3.showHabitat() + ", " + myAnimal3.whatIsYourSpecialty() );
        
        // scope test
        System.out.println("Rhino scope test: " + ( myAnimal2a==myAnimal2b));
        
//        System.out.println(myAnimal4.whatIsYourSpecialty());
        
        context.close();
	}

}
