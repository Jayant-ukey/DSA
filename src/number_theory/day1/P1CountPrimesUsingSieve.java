package number_theory.day1;

import java.util.Arrays;

// https://leetcode.com/problems/count-primes/description/


class Solution {
	//It will TLE
    public boolean checkPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i == 0){
                return true;
            }
        }
        return false;
    }

    public boolean[] primeSieve(int n){
        boolean[] arr = new boolean[n+1];

        Arrays.fill(arr, true);
        arr[0] = arr[1] = false;

        for(int i=2; i*i<=n; i++){

            if(!arr[i])
                continue;

            for(int j=i*i; j<=n; j+=i){
                arr[j] = false; 
            }
        }
        return arr;
    }

    public int countPrimes(int n) {
        if(n == 0) return 0;

        boolean[] checkPr = primeSieve(n);
        int count = 0;
                
        for(int i=0; i<n; i++){
            if(checkPr[i])
                count++;
        }
        return count;
    }
}


public class P1CountPrimesUsingSieve {

}
