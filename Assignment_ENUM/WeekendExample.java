package project1;

public class WeekendExample {
	public enum Weekend {

		SATURDAY,
		SUNDAY
	}

	public static void main(String[] args) {
		Weekend today = Weekend.SATURDAY;
		Weekend today1 = Weekend.SUNDAY;
		
		switch(today) {
		case SATURDAY:
			System.out.println("First Day of the weekend: "+today);
		case SUNDAY:
			System.out.println("Second Day of the weekend: "+today1);
		}
	}
}
