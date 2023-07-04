package collectionExercise.PriorityQueue;

import java.util.PriorityQueue;

public class Ex3 {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("RED");
		queue.add("GREEN");
		queue.add("BLUE");
		queue.add("PURPLE");
		
		System.out.println("Priority Queue 1 : "+queue);
		
		PriorityQueue<String> queue2 = new PriorityQueue<>();
		queue2.add("ORANGE");
		queue2.add("MANGO");
		queue2.add("APPLE");
		
		System.out.println("Priority Queue 2 : " +queue2);
		
		queue2.addAll(queue);
		
		System.out.println("New Priority Queue: "+queue2);
	}
}
