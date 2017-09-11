package process.model;

public class Polygon {
	
	private int sides;
	private boolean Initialized = false;
	
	public Polygon() {
		this.sides = 4; //assume square
		Initialized = true;
	}
	
	public Polygon(int sides) {
		this.sides = sides;
		Initialized = true;
	}
	
	public int getSides() {
		return sides;
	}
	
	public void setSides(int sides) {
		this.sides = sides;
	}
	
	public String toString() {
		return "This Polygon has " + sides + " Sides";
	}
	
		
}
