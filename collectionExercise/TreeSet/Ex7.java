package collectionExercise.TreeSet;

import java.util.TreeSet;

public class Ex7 {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		  treeSet.add("Red");
		  treeSet.add("Green");
		  treeSet.add("Orange");
		  treeSet.add("White");
		  treeSet.add("Black");
		  
		  System.out.println("Tree set: "+treeSet);
		  
		  System.out.println("Size of TreeSet: "+treeSet.size());
	}
}
