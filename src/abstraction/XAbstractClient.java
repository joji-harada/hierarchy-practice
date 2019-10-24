package abstraction;

import java.text.DecimalFormat;

public class XAbstractClient {
	
	public static void print(AbstractShape shape) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("\n---------" + shape.getClass() + "---------");
		System.out.println("X Coordinates: " + shape.getX());
		System.out.println("Y Coordinates: " + shape.getY());
		System.out.println("Parameters (toString method): \n" + shape.toString());
		System.out.println("Perimeter: \t" + df.format(shape.perimeter()));
		System.out.println("Area: \t\t" + df.format(shape.area()));
		if(shape instanceof Circle) {
			Circle c = (Circle) shape;
			System.out.println("Radius: \t" + df.format(c.getRadius())+ "\n");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration of three shapes.
		AbstractShape shape = new Circle(12);
			print(shape);
		shape = new Rectangle(12, 4);
			print(shape);
		shape = new Triangle(12, 35, 37);
			print(shape);
			
	}

}
