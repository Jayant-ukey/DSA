package number_theory.day1;

import java.util.Arrays;


//VSieve of Eratosthenes - week 13 : Introduction to Sieve of Eratosthenes
public class P2PrimeSieve {

	public static boolean[] primeSieve(int n) {
		boolean isPrime[] = new boolean[n+1];
		
		Arrays.fill(isPrime, true); // Filling intitally all the array values as a true
		
		isPrime[0] = isPrime[1] = false;	// 0 and 1 are falling under prime category so mark it as false
		
		for(int i=2; i*i<=n; i++) {			// Running loop till square root of n, as after that if we try, then we will found that it was already multiple of someone
			if(!isPrime[i])	// If number is not-prime then we are continuing the loop
				continue;
			
			//here i is the prime number, and all the multiple's of i is divisible by i only. Hence we are running loop from multiple of i,
			//And we r incrementing j by i, so that it would be multiple of i and we can set it as non-prime i.e false 
			for(int j=i*i; j<=n; j+=i) { // increment j by i value
										// Instead of i*2 ,we are running loop for multiple of primes(i*i)// as the composite number is divisible by prime number
										//To understand it better-ly u can dry run by taking n value as 30. 
				isPrime[j] = false;
			}
		}
		
		return isPrime;
	}
	
	public static void main(String[] args) {
		boolean[] ans = primeSieve(50);
		
		for(int i=1;i<ans.length;i++) {
			System.out.println(i+" -> "+ans[i]);
		}
	}
	
}
