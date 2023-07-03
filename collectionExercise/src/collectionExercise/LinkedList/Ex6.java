package collectionExercise.LinkedList;

import java.util.LinkedList;

public class Ex6 {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("TIGER");
		linkedList.add("ZEBRA");
		linkedList.add("LION");
		linkedList.add("MONKEY");
		
		System.out.println("Original List: "+linkedList);
		
		System.out.println("Adding element at first and last positon....");
		
		linkedList.addFirst("BEAR");
		linkedList.addLast("JAGUAR");
		
		System.out.println("New ArrayList: "+linkedList);
	}
}
