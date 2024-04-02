package hash_map.general;

import java.util.HashMap;
import java.util.Scanner;

public class P1HighestFreqChar {

	//Que : find out the character which come most in a string
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> hm = new HashMap<>();

		System.out.println("Enter string");
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if(hm.containsKey(c)) {
				int oldFreq = hm.get(c);
				int newFreq = oldFreq + 1;
				
				hm.put(c, newFreq);		
			}
			else {
				hm.put(c, 1);
			}
		}
		
		
		//TO find out the maximum frequency character
		char maxFreqChar = str.charAt(0);
		for(Character key : hm.keySet()) {
			if(hm.get(key) > hm.get(maxFreqChar)) {
				maxFreqChar = key;
			}
		}
		
		System.out.println("Highest Frequency Character is "+maxFreqChar+ " with frequency "+hm.get(maxFreqChar));
	}
}
