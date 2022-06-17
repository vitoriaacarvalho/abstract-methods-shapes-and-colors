package entities;

public abstract class Shape {
	protected Color color;
	
	public Shape() {
		super();
	}
	
	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();
	
	
	
	
}
