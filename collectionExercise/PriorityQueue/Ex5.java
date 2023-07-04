package collectionExercise.PriorityQueue;

import java.util.PriorityQueue;

public class Ex5 {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("RED");
		queue.add("GREEN");
		queue.add("BLUE");
		queue.add("PURPLE");
		
		System.out.println("Elements in priority queue: ");
		System.out.println(queue);
		
		queue.clear();
		
		System.out.println("New Priority queue: \n"+queue);
	}

}
