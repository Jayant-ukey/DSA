package hash_map.general;

import java.util.HashMap;

public class P4GetCommonEleIntersection {

	//Que : Elements which are common in both the arrays that we need to print
	
	//Appraoch : 1st hashmap contains freq of first array
	// while iteration 2nd array we will consume freq of first array
	public static void main(String[] args) {
		
		int[] arr = {1, 1, 2, 2, 2, 3, 5};
		int [] arr2 = {1, 1, 1, 2, 2, 4, 5};
		
		HashMap<Integer, Integer> hm = new HashMap();
		
		for(int i=0; i<arr.length; i++) {
			if(hm.containsKey(arr[i])) {
				int of = hm.get(arr[i]);
				hm.put(arr[i], of+1);
			}
			else
				hm.put(arr[i],1);
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(hm.containsKey(arr2[i])) {
				
				int of = hm.get(arr2[i]);
				//CHeck if freq is less than 0 or not
				if(of > 0) {
					System.out.print(arr2[i]+" "); //printing the element which is common in both the array
					hm.put(arr[i], of-1);
				}
			}
		}
		
	}
}
