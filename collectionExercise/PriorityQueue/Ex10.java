package collectionExercise.PriorityQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Ex10 {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("RED");
		queue.add("GREEN");
		queue.add("BLUE");
		queue.add("PURPLE");
		
		System.out.println("Elements in priority queue: ");
		System.out.println(queue);
		
		List<String> list = new ArrayList<>(queue);
		System.out.println("Array containing Queue Elements: "+list);
	}
}
