package hash_map.day2;

import java.util.HashMap;


//  https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
public class P2LongestSubArr {

	 // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        
    	
    	//In case of unordered map worst complexity is O(n^2), and in best time O(n)
    	//In order map time complexity will be always O(n logn)
        HashMap<Integer, Integer> preSum = new HashMap<>();
        int sum=0, maxLen = 0;
        for(int i=0; i<A.length; i++){
            sum += A[i];
            if(sum == K){
                maxLen = Math.max(i+1, maxLen);
            }
            
            int rem = sum - K;
            if(preSum.containsKey(rem)){
                maxLen =  Math.max(maxLen, i-preSum.get(rem));
            }
            
            if(!preSum.containsKey(sum)){
                    preSum.put(sum, i);
            }
        }
       return maxLen; 
    }
    
    
}
