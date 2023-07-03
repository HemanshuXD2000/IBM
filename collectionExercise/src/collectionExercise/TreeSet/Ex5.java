package collectionExercise.TreeSet;

import java.util.TreeSet;

public class Ex5 {
	
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		  treeSet.add("Red");
		  treeSet.add("Green");
		  treeSet.add("Orange");
		  treeSet.add("White");
		  treeSet.add("Black");
		  
		  System.out.println("Tree set: "+treeSet);
		  
		  System.out.println("First Element: " +treeSet.first());
		  System.out.println("Last Element: " +treeSet.last());
	}

}
