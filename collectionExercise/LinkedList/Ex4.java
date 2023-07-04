package collectionExercise.LinkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Ex4 {

	public static void main(String[] args) {
		Collection<String> linkedList = new LinkedList<String>();
		
		linkedList.add("TIGER");
		linkedList.add("ZEBRA");
		linkedList.add("LION");
		linkedList.add("MONKEY");
		
		Iterator<String> itr = ((LinkedList<String>) linkedList).descendingIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
