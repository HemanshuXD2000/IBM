package collectionExercise.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Ex1 {
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer,String>();
		
		treeMap.put(1, "RED");
		treeMap.put(2,"GREEN");
		treeMap.put(3, "BLUE");
		
		for(Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey()+ "=>" +entry.getValue());
		}
	}
}
