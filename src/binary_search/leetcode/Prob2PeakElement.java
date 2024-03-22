package binary_search.leetcode;

// 162. Find Peak Element :-  https://leetcode.com/problems/find-peak-element/

public class Prob2PeakElement {
	
	public int findPeakElement(int[] nums) {
        if(nums.length-1 == 0) return 0;

        if(nums[0]> nums[1]) return 0;

        if(nums[nums.length-1] > nums[nums.length-2]) return nums.length-1;

        int l=1, r=nums.length-2;

        while(l <= r){
            int mid = l + (r-l)/2;
            int ans = nums[mid];

             if(ans>nums[mid-1] && ans>nums[mid+1]){
                return mid;
            }

            else if(ans > nums[mid-1]){
                l = mid+1;
            }

            else
                r = mid-1;
        }
        return 0;
    }

}
