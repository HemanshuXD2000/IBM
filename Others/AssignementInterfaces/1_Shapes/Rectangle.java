package assignmentInterfaces;

public class Rectangle implements Shape{
	private double height;
	private double width;
	
		
	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return height*width;
	}
}
