package project1;

public class Square extends Shape {
	public Square(double height, double width) {
		super(height, width);
		// TODO Auto-generated constructor stub
		}
	public static void main(String[] args) {
		Shape rectangle = new Shape(5.0,5.0);
		MyColor color = MyColor.BLUE;
		System.out.println("Square length: " + rectangle.getHeight());
        System.out.println("Square width: " + rectangle.getWidth());
        System.out.println("Square area: " + rectangle.calculateShape());
		System.out.println("Color: "+color);
	}
}
