package hash_map.general;

import java.util.HashMap;
import java.util.Set;

public class P2GetCommonEle {

	//Que : Print elements which is common in bothe the array
	public static void main(String[] args) {

		int[]  one = {1,1,2,3,2,5,6};
		int[]  two = {1,1,1,2,2,4};
		
		HashMap<Integer, Integer> arr = new HashMap();
		
		for(int i=0; i<one.length; i++) {
			if(arr.containsKey(one[i])) {
				int freq = arr.get(one[i]);
				arr.put(one[i], freq+1);
			}
			
			else {
				arr.put(one[i], 1);
			}
		}
		
		for(int i=0;i<two.length;i++) {
			if(arr.containsKey(two[i])) {
				System.out.print(two[i]+" ");
				arr.remove(two[i]);
			}
		}
		
	}
	
}
