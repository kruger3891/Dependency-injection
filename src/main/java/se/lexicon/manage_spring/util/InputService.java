package se.lexicon.manage_spring.util;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InputService {

	private Scanner sc;
	
	@Autowired
	public InputService(Scanner sc) {
		this.sc = sc;
	}
	
	

}
