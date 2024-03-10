package binary_search.notes.day2;

import java.util.Scanner;

/*
	We apply binary search to the sorted array.
	But if we get an unsorted array and then we need find any element in that array, then how do you finalize that this are the 
	elements which are always searchable?
	
	Ans : 1. If the elements in the left side of target is less than target element,
		  2. If the elements on the right side of target are greater than target elements.
*/
public class P2ModifiedBinarySearchable {
	
	 public static int randomBinarySearchable(int arr[], int n) {
	        int preMax[] = new int[n];
	        int sufMin[] = new int[n];

	        for(int i = 0; i < n; ++i)
	            preMax[i] = i == 0? arr[i] : Math.max(arr[i], preMax[i-1]);

	        for(int i = n - 1; i >= 0; --i)
	            sufMin[i] = i == n - 1? arr[i] : Math.min(arr[i], sufMin[i+1]);

	        int cnt = 0;

	        for(int i = 0; i < n; ++i) {
	            int leftMax = (i == 0)? Integer.MIN_VALUE : preMax[i - 1];
	            int rightMin = (i == n-1)? Integer.MAX_VALUE : sufMin[i + 1];

	            if(arr[i] > leftMax && arr[i] < rightMin)
	                cnt++;
	        }
	        return cnt;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int arr[] = new int[n];

	        for(int i = 0; i < n; ++i)
	            arr[i] = sc.nextInt();

	        System.out.println(randomBinarySearchable(arr, n));
	    }
	    
		/* Sample Input
		 * 7
		 *  1 6 4 10 3 5 7
		 *  
		 *  O/P : 1
		 */

}
