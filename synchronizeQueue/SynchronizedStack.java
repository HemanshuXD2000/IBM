package synchronizeQueue;

import java.util.LinkedList;

public class SynchronizedStack<T> {
	private LinkedList<T> stack;
	
	public SynchronizedStack() {
		this.stack = new LinkedList<>();
	}
	
	public synchronized void push(T item) {
		stack.push(item);
	}
	
	public synchronized T pop() {
		if(stack.isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		return stack.pop();
	}
	
	public synchronized boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public synchronized int size() {
		return stack.size();
	}
}
