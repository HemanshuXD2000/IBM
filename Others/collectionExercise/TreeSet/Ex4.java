package collectionExercise.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex4 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		  treeSet.add("Red");
		  treeSet.add("Green");
		  treeSet.add("Orange");
		  treeSet.add("White");
		  treeSet.add("Black");
		  
		  System.out.println("Original Tree set: "+treeSet);
		  
		  Iterator<String> itr = treeSet.descendingIterator();
		  
		  System.out.println("Element in reverse order: ");
		  while(itr.hasNext()) {
			  System.out.println(itr.next());
		  }
	}
}
