package collectionExercise.HashMap;

import java.util.HashMap;

public class Ex3 {
	
	public static void main(String args[]) {  
		
		  HashMap<Integer,String> hashMap= new HashMap<Integer,String>();
		  
		  hashMap.put(1, "Red");
		  hashMap.put(2, "Green");
		  hashMap.put(3, "Black");
		  hashMap.put(4, "White");
		  hashMap.put(5, "Blue");
		  
		 System.out.println("first hashmap: "+hashMap);
		 
		 HashMap<Integer, String> newHashMap = new HashMap<Integer, String>();
		 
		 newHashMap.put(6, "Purple");
		 newHashMap.put(7, "Cyan");
		 
		 System.out.println("Second hashmap: "+newHashMap);
		 
		 newHashMap.putAll(hashMap);
		 
		 System.out.println("Values of 2nd hashmap : "+newHashMap);
	}

}
