package collectionExercise.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ex8 {
	
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("RED");
		strings.add("BLUE");
		strings.add("ORANGE");
		strings.add("WHITE");
		
		System.out.println("Original ArrayList: \n" +strings);
		
		Collections.sort(strings);
		
		System.out.println("\nAfter sorting: \n"+strings);
		
		
	}

}
