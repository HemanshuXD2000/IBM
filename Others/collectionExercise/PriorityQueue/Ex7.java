package collectionExercise.PriorityQueue;

import java.util.PriorityQueue;

public class Ex7 {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("RED");
		queue.add("GREEN");
		queue.add("BLUE");
		queue.add("PURPLE");
		
		System.out.println("Elements in first priority queue: ");
		System.out.println(queue);
		
		PriorityQueue<String> queue2 = new PriorityQueue<>();
		queue2.add("RED");
		queue2.add("BLACK");
		queue2.add("PURPLE");
		queue2.add("WHITE");
		
		System.out.println("Elements in second priority queue:\n " +queue2);
		
		for(String elements : queue) {
			System.out.println(queue2.contains(elements)?"YES":"NO");
		}
	}
}
