package collectionExercise.LinkedList;

import java.util.Collection;
import java.util.LinkedList;

public class Ex2 {
	
	public static void main(String[] args) {
		Collection<String> linkedList = new LinkedList<String>();
		
		linkedList.add("TIGER");
		linkedList.add("ZEBRA");
		linkedList.add("LION");
		linkedList.add("MONKEY");
		
		for(String element : linkedList) {
			System.out.println(element);
		}
	}
}
