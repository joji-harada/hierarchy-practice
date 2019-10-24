package shapes;

import java.text.DecimalFormat;

public class XInterfaceClient {
	
	/*************************************************************************************
	 * 
	 * prints out information about shape
	 * @param shape
	 * 
	 *************************************************************************************/
	
	public static void print(Shapeable shape) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("\n---------" + shape.getClass() + "---------");
		System.out.println("Parameters (toString method): \n" + shape.toString());
		System.out.println("Perimeter: \t" + df.format(shape.perimeter()));
		System.out.println("Area: \t\t" + df.format(shape.area()));
		if(shape instanceof Circle) {
			Circle c = (Circle) shape;
			System.out.println("Radius: \t" + df.format(c.getRadius()) + "\n");
		}	
	}
	
	/*************************************************************************************
	 * 
	 * prints out information about array of type shapeable
	 * @param shape
	 * 
	 *************************************************************************************/
	
	public static void printer(Shapeable[] shape) {
		for(int i = 0; i < shape.length; i++) {
			//holds a temporary shapeable object for accessing object methods
			Shapeable temp = shape[i];
			
			DecimalFormat df = new DecimalFormat("0.00");
			System.out.println("\n---------" + temp.getClass() + "---------");
			System.out.println("Parameters (toString method): \n" + temp.toString());
			System.out.println("Perimeter: \t" + df.format(temp.perimeter()));
			System.out.println("Area: \t\t" + df.format(temp.area()));
			if(temp instanceof Circle) {
				Circle c = (Circle) temp;
				System.out.println("Radius: \t" + df.format(c.getRadius()) + "\n");
			}
		}
	}
	
	/*************************************************************************************
	 * 
	 * compares the area of two shapes and returns information regarding equality
	 * @param s1
	 * @param s2
	 * @return
	 * 
	 *************************************************************************************/
	
	public static String equalArea(Shapeable s1, Shapeable s2) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		if(s1.area() != s2.area()) {
			return	"Shape 1 area: \t" + df.format(s1.area()) + "\n" +
					"Shape 2 area: \t" + df.format(s2.area()) + "\n" +
					"These shapes do not have the same area.";			
		}
		return 	"Shape 1 area: \t" + df.format(s1.area()) + "\n" +
				"Shape 2 area: \t" + df.format(s2.area()) + "\n" +
				"These shapes have the same area.";		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapeable shape = new Circle(8);
			print(shape);
		shape = new Rectangle(8, 5);
			print(shape);
		shape = new Triangle(8, 15, 17);
			print(shape);
	
		System.out.println();
		System.out.println();
		System.out.println("******************BELOW CHECKS equalArea METHOD******************");
		System.out.println();
		
		Shapeable shape1 = new Circle(10);
		Shapeable shape2 = new Circle(10);
		System.out.print(equalArea(shape1, shape2));
		System.out.println();
		System.out.println();
		
		Shapeable shape3 = new Circle(10);
		Shapeable shape4 = new Circle(7);
		System.out.print(equalArea(shape3, shape4));
			
		
		System.out.println();
		System.out.println();
		System.out.println("*****BELOW IS A PRINT OF AN ARRAY OBJECT OF SHAPEABLE OBJECTS*****");
		System.out.println();
		
		//SECONDARY MODULAR IMPLEMENTATION USING POLY MORPHISM (USING AN ARRAY)
		Shapeable[] shapes =   {new Circle(13),
								new Triangle(24, 31, 62),
								new Rectangle(39, 42),
								new Triangle(59, 42, 87)};
		
		printer(shapes);
	}

}
