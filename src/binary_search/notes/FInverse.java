package binary_search.notes;

/*
	The problem is that given a number N, 
	we need to find flnverse(N). 
	
	In other words, we need to find a valid value K, such that f(K) = N 
	
	In yet another words, we're basically given the output (N) of the 
	function, and we need to find what to give as an input (K) so that 
	we get the given output (N). 
	
	Input : 1370 , Output : 1234 
	Input : 8 , Output : 8 
	Input : 237 , Output : 214 
	Input : 55 , Output : 50 
	Input : 243 , Output : -1 
*/


public class FInverse {
	
	
	//This is the same function that we write in class DivIsIntDiv
	public int sumNo(int no) {
		int ans = 0;
		
		while(no > 0) {
			ans = ans + no;
			no = no/10;
		}
		return ans;
	}
	
	//	We are able to apply binary search here, because the function is monotonically increasing function
	//	Here search place will be in between 0 to no, as the solution is always less than the given no.
	// Ex if no=1370 -> ans=1234, no=237 -> ans=214
	public int sumNoInv(int no) {
		
		int l=0, r=no;
		
		while(l<=r) {
			int mid = l + (r-l)/2;
			int midAns = sumNo(mid);
			if(midAns == no) {
				
				return mid;
			}
			
			else if(midAns < no) {
				l = mid + 1;
			}
			
			else
				r = mid-1;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		FInverse obj = new FInverse();
		
		int n = 1370;
		
		/*
		 * Using Linear search
		 * 
		 * Here we are simply checking for the number whose division/10 will give you
		 * the answer and the searching space for the element we are taking it as 0 -
		 * 10pow7
		 * 
		 * Time Complexity : n*log(n) -> where log(n) : time complexity of sumNo()
		 * function
		 */
		
		/*
		 * int ans = -1; for(int i=0; i<10000000; i++) { if(obj.sumNo(i) == n) { ans =
		 * i; } }
		 * 
		 * System.out.println(ans);
		 */
		
		System.out.println(obj.sumNoInv(n));
		
	}

}
