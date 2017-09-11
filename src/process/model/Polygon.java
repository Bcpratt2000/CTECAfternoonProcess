package process.model;

public class Polygon {
	
	private int sides;
	
	public Polygon() {
		this.sides = 4; //assume square
	}
	
	public Polygon(int sides) {
		this.sides = sides;
	}
	
	public int getSides() {
		return sides;
	}
	public String toString() {
		return "This Polygon has " + sides + " Sides";
	}
		
}
