package binary_search.notes.day2;


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
