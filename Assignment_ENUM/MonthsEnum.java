package project1;

public class MonthsEnum {

	public enum Months{
		JAN,
		FEB,
		MAR,
		APR,
		MAY,
		JUN,
		JUL,
		AUG,
		SEP,
		OCT,
		NOV,
		DEC
	}
	public static void main(String[] args) {
		Months currentMonth = Months.JUN;
		
		System.out.println("Current Month: " +currentMonth);
	}
}
