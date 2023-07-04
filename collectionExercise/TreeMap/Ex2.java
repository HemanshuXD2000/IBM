package collectionExercise.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class Ex2 {
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<String,String>();
		
		treeMap.put("c4", "RED");
		treeMap.put("c2","GREEN");
		treeMap.put("c1", "BLUE");
		
		System.out.println("Original TreeMap: "+treeMap);
	}
	class SortKey implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o1.compareTo(o2);
		}
	}
}
