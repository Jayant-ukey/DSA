package binary_search.notes.day2;

/*
		Binary Searchable Elements 
		The problem is that given an array containing unique integers, 
		you need to find the number of array elements which can be 
		searched using the binary search algorithm.
		
		Example: 
		Input : [1, 6, 4, 10, 3, 5, 7] 
		Output: 3 
		Explanation: 
		1, 6 and 10 will be searchable, others won't be. 
		
*/

/*	APPROACH
	- Here, we simply use linear search approach to find binary searchable element.
	- In binary search we are checking whether target element is foundable or not.
	- So, here we can pass every element as a target to binary search function to check it is searchable or not.
*/

//Time : O(NlogN)

public class BinarySearchableElemntsCount {

	public static boolean binarySearch(int[] arr, int target) {
		int l = 0, size = arr.length;
		int r = size-1;
		
		while(l <= r) {
			int mid = l + (r-l)/2;
			
			if(arr[mid] == target)
				return true;
			
			else if(arr[mid] > target)
				r = mid-1;
			
			else 
				l = mid+1;
		}
		
		return false;
	}
	
	public static int searchableElementsCount(int[] arr) {
		int count = 0;
		
		//Iterate through each element of an array, and pass it as a target to binarySearch function to check whether it is searchable or not.
		for(int i=0; i<arr.length; i++) {
			if(binarySearch(arr, arr[i])) count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 6, 4, 10, 3, 5, 7};
		
		System.out.println("Count : "+searchableElementsCount(arr));
	}
}
