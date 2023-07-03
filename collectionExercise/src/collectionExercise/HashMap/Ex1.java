package collectionExercise.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
	public static void main(String args[]) {  
		
		  HashMap<Integer,String> hashMap= new HashMap<Integer,String>();
		  
		  hashMap.put(1, "Red");
		  hashMap.put(2, "Green");
		  hashMap.put(3, "Black");
		  hashMap.put(4, "White");
		  hashMap.put(5, "Blue");
		  
		  for(Map.Entry x:hashMap.entrySet()){  
		   System.out.println(x.getKey()+" "+x.getValue());  
		  }  
	}
}
