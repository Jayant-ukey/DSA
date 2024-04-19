package ageneral.generic_method;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerSorting {
	
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		
		intList.add(98);
		intList.add(8);
		intList.add(19);
		intList.add(81);
		intList.add(88);
		
		System.out.println("Before Sorting");
		MyUtils.iterateList(intList);
		
		Collections.sort(intList, Collections.reverseOrder());
		System.out.println("\nAfter Sorting in revserse order");
		MyUtils.iterateList(intList);
			
	}

}
 