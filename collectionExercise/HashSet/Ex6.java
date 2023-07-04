package collectionExercise.HashSet;

import java.util.HashSet;

public class Ex6 {
	
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("TIGER");
		hashSet.add("MONKEY");
		hashSet.add("LION");
		hashSet.add("BEAR");
		
		System.out.println("Original HashSet: "+hashSet);
		
		HashSet<String> newHashSet = new HashSet<String>();
		
		newHashSet = (HashSet)hashSet.clone();
		
		System.out.println("Cloned HashSet: "+newHashSet);

	}

}
