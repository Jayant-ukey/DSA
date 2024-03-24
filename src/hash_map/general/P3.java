package hash_map.general;

import java.util.HashMap;


// 2283. Check if Number Has Equal Digit Count and Digit Value-  https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/description/
public class P3 {

	public boolean digitCount(String num) {
        HashMap<Character, Integer> hm = new HashMap();

        //Make the frequency array
        for(int i=0; i<num.length(); i++){
            if(hm.containsKey(num.charAt(i))){
                int of = hm.get(num.charAt(i));
                hm.put(num.charAt(i), of+1);
            }
            else{
                hm.put(num.charAt(i), 1);
            }
        }

        for(int i=0; i<num.length(); i++){
//        	System.out.println(num.charAt(i)+" : "+hm.getOrDefault((char)(i+'0'), 0));
        	int value = hm.getOrDefault((char)(i+'0'), 0);//For converting int to char adding 0
        	int val2 = ((int)(num.charAt(i)- '0'));		// while converting in to int it taking as a ASCII value that's why minus '0'
//        	System.out.println(value + ", val2 "+val2);
            if(value != val2){
                return false;
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
		P3 obj = new P3();
		System.out.println(obj.digitCount("030"));
	}
}
