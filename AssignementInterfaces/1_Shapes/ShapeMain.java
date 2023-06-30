package assignmentInterfaces;

public class ShapeMain {
	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(6,12);
		
		Circle circle = new Circle(5);
		
		Triangle triangle = new  Triangle(7, 6);
		
		System.out.println("Area of rectangle is: "+rectangle.getArea());
		System.out.println("Area of circle is: "+circle.getArea());
		System.out.println("Area of triangle is: "+triangle.getArea());
	}
}
