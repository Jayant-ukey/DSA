package number_theory.day2;


//Samllest prime factor means, for every number what is smallest prime factor tha we need to tell
public class P1SPF {

	public static int[] primeSieve(int n) {
		int[] arr = new int[n+1]; // Initially all the values of the array will be 0
		
		for(int i=2; i<=n; i++) {
			if(arr[i] > 0) // If arr element already contain something then it not be the prime 
				continue;
			
			arr[i] = i; //If it's a prime number then SPF will be itself
			
			if((long)i*i > (long)n) // Here we are taking the condition of square root
				continue;
			
			for(int j=i*i; j<=n; j+=i) {
				if(arr[j] == 0) //if arr[j] contains nothing then it's smallest prime factor must be i;
					arr[j] = i;
			}
			
		}
		return arr;
	}
	
	public static void main(String[] args) {
	
		int ans[] = primeSieve(30);
		for(int i=0; i<ans.length; i++) {
			System.out.println(i+" : "+ans[i]);
		}
	}
}
