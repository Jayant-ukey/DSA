package binary_search.leetcode;

// 69. Sqrt(x) :-  https://leetcode.com/problems/sqrtx/description/

public class Prob1Sqrtx {

	 // Approach 1 : Brute Force
	   public int mySqrt(int x) {
	        
		   int ans = 0;

	        // taking i as long, because for x=2147395600, we are loosing precision, 
	        // i.e. int value is not able to store 46341 * 46341, that's why we are taking i as long
	        for(long i=0; i<=x; i++){
	            if(i*i <= x)
	                ans = (int)i;

	            else 
	                return ans;
	        }
	        return ans;
	    }
	   
	   
	   //Approach 2 : Binary Search
	   public int mySqrt1(int x) {

	        int ans = 0, l=0, r=x;

	        //Running loop while left is less than or equal to right
	        while(l <= r){
	            //Here we are taking mid as long to check -> mid*mid <= x
	        	//('long' because otherwise mid*mid can overflow)
	            long mid = l + (r-l)/2;

	            //1. if mid*mid is less than or equal to x then storing it in ans
	            //2. check further for the greater elements 
	            if(mid*mid <= x){
	                ans = (int)mid;
	                l = (int)mid + 1;
	            }

	            else{
	                r = (int)mid -1;
	            }
	        }
	        return ans;
	    }
	
}
