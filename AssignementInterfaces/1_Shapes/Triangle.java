package assignmentInterfaces;

public class Triangle implements Shape {
	
	private double height;
	private double width;
	
		public Triangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}

		@Override
		public double getArea() {
			// TODO Auto-generated method stub
			return 0.5*height*width;
		}
}
