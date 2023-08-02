package threadexercise;

public class Ex2 {

		public static void main(String[] args) {
			Thread even = new Thread(new PrintEven());
			Thread odd = new Thread(new PrintOdd());
			
			even.start();
			odd.start();
		}
	}
