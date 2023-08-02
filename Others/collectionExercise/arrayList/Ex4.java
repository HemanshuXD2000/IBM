package collectionExercise.arrayList;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("RED");
		strings.add("BLUE");
		strings.add("ORANGE");
		strings.add("WHITE");
		
		String atPosition = strings.get(2);
		
		System.out.println(atPosition);
	}
}
