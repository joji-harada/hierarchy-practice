package test;
import college.*;
import shapes.*;

public class Testing {
	public static void main(String[] args) {
		//person test
		Person b = new Person("George", 26);
		System.out.println(b);
		
		
		//student test 
		Student a = new Student("Jeanie", 26, Rank.SENIOR, Major.ASTRONOMY, 3.8);
		System.out.println(a);
		
		Student z = new Student(b, Rank.SENIOR, Major.ENGINEERING, 4.0);
		System.out.println(z);
		
		
		//employee test
		Employee c = new Employee("Jeanie", 26, "BE147", 52125.0, 11.5);
		System.out.println(c);
		
		
		//circle test
		Circle d = new Circle(14);
		System.out.println(d);
		
		
		//rectangle test
		Rectangle e = new Rectangle(5,5);
		System.out.println(e);
		
		
		//Triangle test
		Triangle f = new Triangle(27,15,38);
		System.out.println(f);
	}
}
