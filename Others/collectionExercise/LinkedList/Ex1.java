package collectionExercise.LinkedList;

import java.util.Collection;
import java.util.LinkedList;

public class Ex1 {
	
	public static void main(String[] args) {
		Collection<String> linkedList = new LinkedList<String>();
		
		linkedList.add("TIGER");
		linkedList.add("ZEBRA");
		linkedList.add("LION");
		linkedList.add("MONKEY");
		
		System.out.println("The linked list is: "+linkedList);
	}

}
