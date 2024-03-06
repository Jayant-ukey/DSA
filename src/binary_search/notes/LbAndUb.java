package binary_search.notes;

import java.util.Scanner;

//Time : O(LogN)
//Space : O(1)
public class LbAndUb {
	
	int foundLB(int[] arr, int l , int r, int target) {
		
		int ans = arr.length;
		//loop while left is less than or equal to right
		while(l <= r) {	
			int mid = l + (r-l)/2;
			if(arr[mid] >= target) {
				ans = mid; // Save mid in ans
				r = mid-1; //but still keep searching in [l, mid - 1];
			}
			
			else {
				l = mid+1; //// go to [mid + 1, r];
			}
		}
		return ans;
	}
	
	int foundUB(int[] arr, int l, int r, int target) {
		int ans = arr.length;
		
		while(l <= r) {
			int mid = l + (r-l)/2;
			
			if(arr[mid] > target) {  // This 'if' is the only diff b/w ub & lb
				ans = mid;
				r = mid-1;
			}
						
			else {
				l = mid+1;
			}
		}
		return ans;
	}
	
	int lbCall(int[] arr, int target) {
		return foundLB(arr, 0, arr.length - 1, target);
	}
	
	int ubCall(int[] arr, int target) {
		return foundUB(arr, 0, arr.length-1, target);
	}

	public static void main(String[] args) {
		
		LbAndUb ob = new LbAndUb();
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {2, 5, 7, 9, 9, 12};
		
		System.out.println("Enter the target element from given array");
		int target = sc.nextInt();

		System.out.println("Lower Bound : "+ob.lbCall(arr, target));
		System.out.println("Upper Bound : "+ob.ubCall(arr, target));
		
	}
}
