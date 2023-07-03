package collectionExercise.HashSet;

import java.util.HashSet;

public class Ex4 {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("TIGER");
		hashSet.add("MONKEY");
		hashSet.add("LION");
		hashSet.add("BEAR");
		
		System.out.println("Original HashSet: "+hashSet);
		
		hashSet.removeAll(hashSet);
		
		System.out.println(hashSet);

	}
}
