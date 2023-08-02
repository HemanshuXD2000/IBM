package threadexercise;

public class PrintOdd implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=19;i+=2) {
			System.out.println("Odd Number: "+i);
		}
	}
}