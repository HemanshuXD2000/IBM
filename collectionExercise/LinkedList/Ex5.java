package collectionExercise.LinkedList;

import java.util.LinkedList;

public class Ex5 {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("TIGER");
		linkedList.add("ZEBRA");
		linkedList.add("LION");
		linkedList.add("MONKEY");
		
		System.out.println("Adding element at 2nd postion....");
		
		linkedList.add(2,"KANGAROO");
		
		System.out.println("New LinkedList: "+linkedList);
	}
}
