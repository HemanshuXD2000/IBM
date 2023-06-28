package project1;

//Write a Java program to create 
//an enum called "DaysOfWeek" representing 
//the days of the week.

public class DaysofWeekEnum {
	public enum Days{
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY;
	}
	public static void main(String[] args) {
		Days today = Days.WEDNESDAY;
		System.out.println("Today is: "+today);
	}

}
