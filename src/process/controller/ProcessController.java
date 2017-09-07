package process.controller;

import java.util.Scanner;

public class ProcessController {
	
	public void start() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter text: ");
		String in = input.next();
		
		System.out.println(in);
		
		
		
		input.close();
	}
	
}
