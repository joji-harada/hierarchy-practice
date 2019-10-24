package shapes;

import java.text.DecimalFormat;

public class Circle implements Shapeable{
	private int radius;
	
	//constructor
	public Circle() {
		this(1);
	}
	public Circle(Circle other) {
		this(other.radius);
	}
	public Circle(int radius) {
		if (radius <= 0) {
			throw new IllegalArgumentException("Circle radius must be greater than 0");
		}
		this.radius = radius;
	}	
	
	public int area() {
		double calc = Math.PI * (radius * radius);
		int area = (int)calc;
		return area;
	}
	
	//equals method
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			Circle c = (Circle) obj;
			return radius == c.radius;
		}
		return false;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public int perimeter() {
		double calc= Math.PI * 2 * radius;
		int circumference = (int)calc;
		return circumference;
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return 	"\tRadius: \t" + df.format(radius) + "\n" +
				"\tArea: \t\t" + df.format(this.area()) + "\n" +
				"\tPerimeter: \t" + df.format(this.perimeter());
	}
}
