package hash_map.day2;


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
	    
	    public static void main(String[] args) {
			P1SubarraySum obj = new P1SubarraySum();
			int[] arr = {1,1, 1};
			System.out.print("Ans : "+obj.subarraySum(arr, 2));
		}
}
