package process.controller;

import java.util.Scanner;
import process.model.PlayDohCircle;

public class ProcessController {
	
	public void start() {
		
		Scanner input = new Scanner(System.in);
		PlayDohCircle circle = new PlayDohCircle(5);
		
		System.out.println("Circle size: " + circle.getSize());
		System.out.print("Enter text: ");
		String in = input.nextLine();
		
		System.out.println(in);
		
		
		input.close();
	}
	
}
