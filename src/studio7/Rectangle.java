package studio7;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getArea() {		// generate the area of rectangle
		return length*width;
	}
	
	public double getPerimeter() {	// generate the perimeter of rectangle
		return 2*(length+width);
	}
	
	public boolean isSmallerThan(Rectangle other) {
		return this.getArea() < other.getArea();
	}
	
	public boolean isSquare() {
		return length == width;
	}
	
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(4, 5);
		Rectangle rect2 = new Rectangle(2, 3);
		
		System.out.println(rect1);
		System.out.println("Area: " + rect1.getArea() + ", Perimeter: " + rect1.getPerimeter());
        System.out.println("Is Square: " + rect1.isSquare());
        System.out.println("Is Smaller Than rect2: " + rect1.isSmallerThan(rect2));
	}

}
