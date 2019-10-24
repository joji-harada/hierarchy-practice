package abstraction;

import java.text.DecimalFormat;

public class Triangle extends AbstractShape{
	private int a, b, c;
	
	//constructors
	public Triangle() {
		this(1, 1, 1);
	}
	
	public Triangle(Triangle other) {
		this(other.a, other.b, other.c);
	}
	
	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	//area method
	public int area() {
		int s = (a + b + c) / 2;
		if((s - a) == 0 || (s - b) == 0 || (s - c) == 0) {
			throw new IllegalArgumentException("Sides produce 0");
		}
		return (int)Math.sqrt(s * (s-a) * (s-b) * (s-c));
	}
	
	//equals method
	public boolean equals(Object obj) {
		if(obj instanceof Triangle) {
			Triangle tri = (Triangle) obj;
			return a == tri.a && b == tri.b && c == tri.c;
		}
		return false;
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public int getC() {
		return c;
	}
	
	public int perimeter() {
		return a + b + c;
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return 	"\tSide A: \t" + df.format(a) + "\n" +
				"\tSide B: \t" + df.format(b) + "\n" +
				"\tSide C: \t" + df.format(c) + "\n" +
				"\tPerimeter: \t" + df.format(this.perimeter()) + "\n" +
				"\tArea: \t\t" + df.format(this.area());
	}
}
