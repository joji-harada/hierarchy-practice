package shapes;

import java.text.DecimalFormat;

public class Rectangle implements Shapeable{
	//data fields
	private int height, width;
	
	//constructors
	public Rectangle() {
		height = 1;
		width = 1;
	}
	
	public Rectangle(Rectangle other) {
		this.height = other.height;
		this.width = other.width;
	}
	
	public Rectangle(int x, int y) {
		this.height = x;
		this.width = y;
	}
	
	//methods (access)
	public int area() {
		return height + width;
	}
	
	//equals method
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle r = (Rectangle) obj;
			return 	height == r.height &&
					width == r.width;
		}
		return false;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int perimeter() {
		int perim = (2 * height) + (2 * width);
		return perim;
	}
	
	//toString method
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return 	"\tWidth: \t\t" + df.format(width) + "\n" +
				"\tHeight: \t" + df.format(height) + "\n" +
				"\tPerimeter: \t" + df.format(this.perimeter());
	}
}
