package collectionExercise.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ex10 {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("RED");
		strings.add("BLUE");
		strings.add("ORANGE");
		strings.add("WHITE");
		
		System.out.println("Original ArrayList: "+strings);
		
		Collections.shuffle(strings);
		
		System.out.println("\nList after shuffle: "+strings);
	}
}
