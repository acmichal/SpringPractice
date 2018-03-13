package pl.michalkr.springpractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WildlifeConfig {
	
		@Bean
		public Specialty survivalSpecialty() {
			return new SurvivalSpecialty();
		}
		
	    @Bean
	    public Animal anaconda() {
	    	return new Anaconda(survivalSpecialty());
	    }

}
