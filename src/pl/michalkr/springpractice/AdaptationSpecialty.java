package pl.michalkr.springpractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class AdaptationSpecialty implements Specialty {
	
	private String FILENAME = "C:\\Users\\acm21\\eclipse-workspace\\spring-practice\\src\\practiceFile.txt";
	
	List<String> data;
	
	private Random myRandom = new Random();
	

	public AdaptationSpecialty() {
		
		File theFile = new File(FILENAME);
		
		data = new ArrayList<>();
		
			try (BufferedReader br = new BufferedReader(new FileReader(theFile))) {

				String sCurrentLine;

				while ((sCurrentLine = br.readLine()) != null) {
					data.add(sCurrentLine);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
		
		
	@Override
	public String whatIsYourSpecialty() {
		
		int index = myRandom.nextInt(data.size());
		
		String theFortune = data.get(index);
		return theFortune;
	}
}
