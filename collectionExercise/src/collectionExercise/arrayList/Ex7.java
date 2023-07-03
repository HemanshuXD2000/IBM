package collectionExercise.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("RED");
		strings.add("BLUE");
		strings.add("ORANGE");
		strings.add("WHITE");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the element to find: ");
		String find = scanner.next();

		if (strings.contains(find)) {
			System.out.println("Element " + find + " sfound at position: " + strings.indexOf(find));
		}
		else {
			System.out.println("Element not found...");
		}
	}

}
