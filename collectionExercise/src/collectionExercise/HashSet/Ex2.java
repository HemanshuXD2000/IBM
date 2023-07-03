package collectionExercise.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Ex2 {
	
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("TIGER");
		hashSet.add("MONKEY");
		hashSet.add("LION");
		hashSet.add("BEAR");
		
		Iterator<String> itr =  hashSet.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}

	}
	

}
