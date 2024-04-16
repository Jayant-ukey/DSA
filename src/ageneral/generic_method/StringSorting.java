package ageneral.generic_method;

import java.util.ArrayList;
import java.util.Collections;

public class StringSorting {

	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList<>();
		
		stringList.add("Vishal");
		stringList.add("Jayant");
		stringList.add("Manish");
		stringList.add("Nikhil");
		stringList.add("Sarvesh");
		
		System.out.println("Before Sorting");
		MyUtils.iterateList(stringList);
		
		Collections.sort(stringList);
		System.out.println("\nAfter Sorting");
		MyUtils.iterateList(stringList);
		
	}

}
