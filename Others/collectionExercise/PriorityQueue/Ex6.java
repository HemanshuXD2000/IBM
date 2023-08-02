package collectionExercise.PriorityQueue;

import java.util.PriorityQueue;

public class Ex6 {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("RED");
		queue.add("GREEN");
		queue.add("BLUE");
		queue.add("PURPLE");
		
		System.out.println("Elements in priority queue: ");
		System.out.println(queue);
		
		System.out.println("Number of elements in queue: " +queue.size());
	}
}
