package threadexercise;

public class Ex1 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
	}
	public static void main(String[] args) {
		Ex1 thread = new Ex1();
		thread.start();
	}
	
}
