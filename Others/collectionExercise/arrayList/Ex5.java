package collectionExercise.arrayList;

import java.util.ArrayList;

public class Ex5 {
	
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("RED");
		strings.add("BLUE");
		strings.add("ORANGE");
		strings.add("WHITE");
		
		System.out.println("Original ArrayList\n" +strings);
		
		System.out.println("\nUpdating element at 1st and 3rd posotion....");
		
		strings.set(1, "YELLOW");
		strings.set(3, "BLACK");
		
		System.out.println(strings);
	}
}
