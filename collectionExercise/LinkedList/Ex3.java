package collectionExercise.LinkedList;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

public class Ex3 {

	public static void main(String[] args) {
		Collection<String> linkedList = new LinkedList<String>();
		
		linkedList.add("TIGER");
		linkedList.add("ZEBRA");
		linkedList.add("LION");
		linkedList.add("MONKEY");
		
		ListIterator<String> itr = ((LinkedList<String>) linkedList).listIterator(2);
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
				
	}
}	
