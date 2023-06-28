package project1;

public class ShapeEnum {

	public enum Shape{
		SQUARE,
		CIRCLE,
		RECTANGLE,
		TRIANGLE
	}
	
	public static void main(String[] args) {
		Shape shape1 = Shape.SQUARE;
		Shape shape2 = Shape.CIRCLE;
		Shape shape3 = Shape.RECTANGLE;
		Shape shape4 = Shape.TRIANGLE;
		
		System.out.println("First Shape: "+shape1);
		System.out.println("Second Shape: "+shape2);
		System.out.println("Third Shape: "+shape3);
		System.out.println("Fourth Shape: "+shape4);
	}
}