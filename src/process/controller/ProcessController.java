package process.controller;

import java.util.Scanner;

import process.model.*;

public class ProcessController {
	
	public void start() {
		
		Scanner input = new Scanner(System.in);
		
		// PlayDohCircle circle = new PlayDohCircle(5);
// System.out.println("Circle size: " + circle.getSize());
		// System.out.println(circle);
		
		
		
		Polygon shape = new Polygon(0);
		
		while (shape.getSides() <= 0) {
			try {
				System.out.print("Enter number of sides: ");
				shape.setSides(input.nextInt());
				if(shape.getSides()<=0)
					System.out.println("Sides must be greater than 0\n");
			} catch (Exception e) {
				System.out.println("Please enter an integer\n");
			}
			input.nextLine(); //flush the line buffer
		}
		System.out.println("Sides set to " + shape.getSides());
		
//		System.out.print("Enter text: ");
//		String in = input.nextLine();
//		System.out.println(in);
		
		input.close();
	}
	
}
