package se.lexicon.manage_spring.util;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ScannerInputService implements UserInputService {

	private Scanner sc;
	
	@Autowired
	public ScannerInputService(Scanner sc) {
		this.sc = sc;
	}

	@Override
	public String getString() {
		return sc.next();
	}

	@Override
	public int getInt() {
		return sc.nextInt();
	}
	
	

}
