package collectionExercise.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Ex6 {

	public static void main(String args[]) {  
		
		  HashMap<Integer,String> hashMap= new HashMap<Integer,String>();
		  
		  hashMap.put(1, "Red");
		  hashMap.put(2, "Green");
		  hashMap.put(3, "Black");
		  hashMap.put(4, "White");
		  hashMap.put(5, "Blue");
		  
		  System.out.println("Hash Map: "+hashMap);
		  
		  HashMap<Integer, String> hashMap2 = new HashMap<>();
		  
		  hashMap2 = (HashMap<Integer, String>)hashMap.clone();
		  
		  System.out.println("Cloned hash map: "+hashMap2);
	}
}
