package collectionExercise.PriorityQueue;

import java.util.PriorityQueue;

public class Ex8 {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("RED");
		queue.add("GREEN");
		queue.add("BLUE");
		queue.add("PURPLE");
		
		System.out.println("Elements in priority queue: ");
		System.out.println(queue);
		
		System.out.println("First element of priority queue: "+queue.peek());
	}
}
