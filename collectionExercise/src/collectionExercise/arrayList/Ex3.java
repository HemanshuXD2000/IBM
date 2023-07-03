package collectionExercise.arrayList;

import java.util.ArrayList;

public class Ex3 {
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("RED");
		strings.add("BLUE");
		strings.add("ORANGE");
		strings.add("WHITE");
		
		System.out.println("Original ArrayList\n" +strings);
		
		strings.add(0,"GREEN");
		
		System.out.println("\nElement added at the begining.");
		
		System.out.println(strings);
	}
}
