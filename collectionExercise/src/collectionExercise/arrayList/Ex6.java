package collectionExercise.arrayList;

import java.util.ArrayList;

public class Ex6 {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("RED");
		strings.add("BLUE");
		strings.add("ORANGE");
		strings.add("WHITE");
		
		System.out.println("Original ArrayList\n" +strings);
		
		System.out.println("\nRemoving element at 3rd posotion....");
		
		strings.remove(3);
		
		System.out.println(strings);
	}
}
