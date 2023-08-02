package project1;

//Write a Java program to implement 
//an enum called "Direction" with constants 
//representing the cardinal directions (North, South, East, West).

public class DirectionEnum {
	
	public enum Direction{
		NORTH,
		SOUTH,
		EAST,
		WEST
	}
	
	public static void main(String[] args) {
		Direction d1 = Direction.NORTH;
		Direction d2 = Direction.SOUTH;
		
		System.out.println("First Direction: "+d1+ "\nSecond Direction: "+d2);
	}
}
