package collectionExercise.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ex9 {
	
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("RED");
		strings.add("BLUE");
		strings.add("ORANGE");
		strings.add("WHITE");
		
		System.out.println("\nFirst ArrayList: "+strings);
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("TIGER");
		list.add("LION");
		list.add("ZEBRA");
		list.add("MONKEY");
		
		System.out.println("\nSecond ArrayList: "+list);
		
		Collections.copy(strings, list);
		System.out.println("\nAfter copying list: "+strings);
		
	}

}
