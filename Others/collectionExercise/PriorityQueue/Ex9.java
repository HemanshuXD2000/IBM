package collectionExercise.PriorityQueue;

import java.util.PriorityQueue;

public class Ex9 {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("RED");
		queue.add("GREEN");
		queue.add("BLUE");
		queue.add("PURPLE");
		
		System.out.println("Elements in priority queue: ");
		System.out.println(queue);
		
		String remove = queue.peek();
		System.out.println("Element to remove: "+remove);
		
		queue.remove(remove);
		
		System.out.println("New Queue: "+queue);
	}
}
