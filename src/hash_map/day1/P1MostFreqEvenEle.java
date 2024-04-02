package hash_map.day1;

import java.util.HashMap;

//2404. Most Frequent Even Element :-  https://leetcode.com/problems/most-frequent-even-element/description/

public class P1MostFreqEvenEle {

}

class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int oldFreq = hm.get(nums[i]);
                hm.put(nums[i], oldFreq+1);
            }
            else{
                hm.put(nums[i], 1);
            }
        }

        int result = -1, maxFreq = -1;

        for(int key : hm.keySet()){
            int curFreq = hm.get(key);
            
            if(key%2!=0 || curFreq<maxFreq){
                    continue;
            }
                
            else if(curFreq>maxFreq || key<result){
                    result = key;
                    maxFreq = hm.get(key); 
                }
                
            }
        return result;
    }
}