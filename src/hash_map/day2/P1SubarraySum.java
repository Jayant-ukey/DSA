package hash_map.day2;

import java.util.HashMap;

//  https://leetcode.com/problems/subarray-sum-equals-k/description/
public class P1SubarraySum {

	
	    //Can't apply sliding window as -ve values will be also there'
		//O(n^3)
	    public int subarraySum(int[] nums, int k) {
	            int ans=0,sum=0;
	            for(int i=0;i<nums.length;i++){
	                for(int j=i; j<nums.length;j++){
		                sum = 0;

	                    for(int z=i; z<=j;z++) {
		                    sum +=nums[j];     
	                    }
	              
	                    if(sum == k)
		                    ans++;
	                }	                
	            }
	    
	            return ans;
	        }
	    
	    //O(n^2)
	    public int subarraySum1(int[] nums, int k) {
            int ans=0,sum=0;
            for(int i=0;i<nums.length;i++){
                sum = 0;
                for(int j=i; j<nums.length;j++){
                    sum +=nums[j]; 

                    if(sum == k)
                    ans++;
                }
                
            }
            return ans;
        }
	    
	    
	    
	    //O(n)
	    //Before seeing this solution please refer problem P2LongestSubArr
        public int subarraySum3(int[] nums, int k) {
            HashMap<Integer, Integer> hmap = new HashMap<>();
            int sum=0, count=0;
            hmap.put(0,1); // storing 0 first in hash-map, because rem - k=0, and in that case we need to increase count
            for(int i=0; i<nums.length; i++){
                sum += nums[i];
                
                int rem = sum - k;
                if(hmap.containsKey(rem)){
                    count += hmap.get(rem);
                }

                if(hmap.containsKey(sum)){
                    int cntMap = hmap.get(sum);
                    hmap.put(sum,cntMap+1); //If key is already present then increase count
                }
                else{
                    hmap.put(sum, 1); //Here we are storing count instead of index 
                    // In case any confusion dry run for test case nums = [0,0,0,0,0,0,0,0,0,0] , k=0 ->o/p=55
                }

            }
            return count;
        }
	    
	    public static void main(String[] args) {
			P1SubarraySum obj = new P1SubarraySum();
			int[] arr = {1,1, 1};
			System.out.print("Ans : "+obj.subarraySum(arr, 2));
		}
}
