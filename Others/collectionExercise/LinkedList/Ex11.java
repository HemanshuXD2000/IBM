package collectionExercise.LinkedList;

import java.util.LinkedList;

public class Ex11 {
	
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("TIGER");
		linkedList.add("ZEBRA");
		linkedList.add("LION");
		linkedList.add("MONKEY");
		
		System.out.println("Original LinkedList: "+linkedList);
		
		for(int i=0; i<linkedList.size(); i++) {
			System.out.println("Element at index "+i+": "+linkedList.get(i));
		}

}
}
