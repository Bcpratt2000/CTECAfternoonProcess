package process.controller;

import java.util.Scanner;

import process.model.*;

public class ProcessController {
	
	public void start() {
		
		Scanner input = new Scanner(System.in);
		
//		PlayDohCircle circle = new PlayDohCircle(5);
//		System.out.println("Circle size: " + circle.getSize());
//		System.out.println(circle);
		
		Polygon square = new Polygon();
		Polygon triangle = new Polygon(3);
		System.out.println("Square: " + square + "\n" + "Triangle: " + triangle);
		
		System.out.print("Enter text: ");
		String in = input.nextLine();
		
		System.out.println(in);
		
		
		input.close();
	}
	
}
