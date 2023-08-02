package collectionExercise.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex7 {

	public static void main(String args[]) {  
		
		  HashMap<Integer,String> hashMap= new HashMap<Integer,String>();
		  
		  hashMap.put(1, "Red");
		  hashMap.put(2, "Green");
		  hashMap.put(3, "Black");
		  hashMap.put(4, "White");
		  hashMap.put(5, "Blue");
		  
		  Set set = hashMap.entrySet();
		  
		  System.out.println("Set values: "+set);
	}
}
