package project1;

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
