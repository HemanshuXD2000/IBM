package project1;

public class Rectangle extends Shape {

	public Rectangle(double height, double width) {
		super(height, width);
		// TODO Auto-generated constructor stub
		}
	public static void main(String[] args) {
		Shape rectangle = new Shape(5.0,3.0);
		MyColor color = MyColor.GREEN;
		System.out.println("Rectangle length: " + rectangle.getHeight());
        System.out.println("Rectangle width: " + rectangle.getWidth());
        System.out.println("Rectangle area: " + rectangle.calculateShape());
		System.out.println("Color: "+color);
	}
}
