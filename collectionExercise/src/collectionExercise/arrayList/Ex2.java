package collectionExercise.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex2 {
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("RED");
		strings.add("BLUE");
		strings.add("ORANGE");
		strings.add("WHITE");
		
		Iterator<String> itr = strings.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	

}
