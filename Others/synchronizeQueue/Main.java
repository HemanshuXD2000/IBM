package synchronizeQueue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizedStack<Integer> stack = new SynchronizedStack<>();
		SynchronizedQueue<Integer> queue = new SynchronizedQueue<>();
		
		Thread producerThread = new Thread(() ->{
			try {
				for(int i=1;i<=10;i++) {
					stack.push(i);
					System.out.println("Pushed: "+i);
					Thread.sleep(500);
				}
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		});
		
		Thread consumerThread = new Thread(() -> {
			try {
				while(true) {
					int item = stack.pop();
					System.out.println("Popped: "+item);
					queue.enqueue(item);
					Thread.sleep(1000);
				}
			}
			catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			catch (IllegalStateException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		});
		
		Thread dequerThread = new Thread(() -> {
			try {
				while(true) {
					int item = queue.dequeue();
					System.out.println("Dequed: "+item);
					Thread.sleep(1500);
				}
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		});
		
		producerThread.start();
		consumerThread.start();
		dequerThread.start();
	}

}
