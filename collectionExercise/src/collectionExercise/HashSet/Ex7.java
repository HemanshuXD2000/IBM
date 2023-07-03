package collectionExercise.HashSet;

import java.util.HashSet;

public class Ex7 {
	
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("TIGER");
		hashSet.add("MONKEY");
		hashSet.add("LION");
		hashSet.add("BEAR");
		
		System.out.println("Original HashSet: "+hashSet);
		
		String[] array = new String[hashSet.size()];
		hashSet.toArray(array);
		
		System.out.println("Array Elements: ");
		for(String element : array) {
			System.out.println(element);
		}

	}

}
