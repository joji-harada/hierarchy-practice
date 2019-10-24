package abstraction;

public abstract class AbstractShape {
	private int x, y;
	
	//constructors
	public AbstractShape() {
		x = 1;
		y = 1;
	}
	public AbstractShape(AbstractShape other) {
		this.x = other.x;
		this.y = other.y;
	}
	public AbstractShape (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//abstract methods
	public abstract int area();	
	public abstract int perimeter();
	
	//equals method
	public boolean equals(Object obj) {
		if(obj instanceof AbstractShape) {
			AbstractShape as = (AbstractShape) obj;
			return x == as.x && y == as.y;
		}
		return false;
	}
	
	//get methods
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}
