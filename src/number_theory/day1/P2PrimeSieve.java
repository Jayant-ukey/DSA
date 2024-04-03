package number_theory.day1;

import java.util.Arrays;


//VSieve of Eratosthenes - week 13 : Introduction to Sieve of Eratosthenes
public class P2PrimeSieve {

	public static boolean[] primeSieve(int n) {
		boolean isPrime[] = new boolean[n+1];
		
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;		
		for(int i=2; i*i<=n; i++) {
			if(!isPrime[i])
				continue;
			
			for(int j=i*i; j<=n; j+=i) {
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
