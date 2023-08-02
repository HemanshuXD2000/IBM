package synchronizeQueue;

import java.util.LinkedList;
import java.util.Queue;

public class SynchronizedQueue<T> {
	private Queue<T> queue;

	public SynchronizedQueue() {
		this.queue = new LinkedList<>();
	}
	
	public synchronized void enqueue(T item) {
		queue.add(item);
		notifyAll();
	}
	
	public synchronized T dequeue() throws InterruptedException{
		while (queue.isEmpty()) {
			wait();
		}
		return queue.poll();
	}
	
	public synchronized boolean isEmpty() {
		return queue.isEmpty();
	}
	
	public synchronized int size() {
		return queue.size();
	}
}
