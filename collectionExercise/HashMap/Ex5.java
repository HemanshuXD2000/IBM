package collectionExercise.HashMap;

import java.util.HashMap;

public class Ex5 {
	public static void main(String args[]) {  
		
		  HashMap<Integer,String> hashMap= new HashMap<Integer,String>();
		  
		  hashMap.put(1, "Red");
		  hashMap.put(2, "Green");
		  hashMap.put(3, "Black");
		  hashMap.put(4, "White");
		  hashMap.put(5, "Blue");
		  
		  boolean result = hashMap.isEmpty();
		  
		  System.out.println("Is hash map empty: "+result);
		  
		  hashMap.clear();
		  result = hashMap.isEmpty();
		  
		  System.out.println("Is hash map emplty: "+result);
	}
}
