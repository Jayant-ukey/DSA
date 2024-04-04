package number_theory.day1;

import java.util.Map;
import java.util.TreeMap;

public class P0PrimeFactorization {
	
	public static TreeMap<Integer, Integer> primeFact(int n){
		
		TreeMap<Integer, Integer> hmap = new TreeMap<>();
		
		//Time complexity : sqrt(n)
		for(int i=2; i*i<=n; i++) {//Iterating till sqrt, if not understand then dry run for 30;
			
			//If n is not diisible by number then continue the loop
			if(n%i != 0)
				continue;
			
			int power = 0;
			while(n%i == 0)//while number is divisible by prime number run the loop
			{
				n/=i;
				power++;
				
				hmap.put(i, power);
			}
		}
		
		//After iterating over all the elements till sqrt. If any number left, means that number is a prime number thats why we can't divide it further.
		if(n > 1)
			hmap.put(n, 1); //That remaining number will be itself is a prime number, hence store it
		
		return hmap;
	}
	
	public static void main(String[] args) {
		TreeMap<Integer, Integer> ans = primeFact(600);
		for(Map.Entry<Integer, Integer> entry : ans.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}

}
