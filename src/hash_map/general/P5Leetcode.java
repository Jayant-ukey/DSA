package hash_map.general;

import java.util.HashMap;

//2956. Find Common Elements Between Two Arrays-    https://leetcode.com/problems/find-common-elements-between-two-arrays/description/

//Tip : first solve P4, may you get the better solution
public class P5Leetcode {
	
}

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hmOne = new HashMap();
        HashMap<Integer, Integer> hmTwo = new HashMap();
        int[] arr = new int[2];
        int count1=0, count2=0;

        for(int i=0; i<nums1.length; i++){
            if(hmOne.containsKey(nums1[i])){
                int of = hmOne.get(nums1[i]);
                hmOne.put(nums1[i], of+1);
            }
            else{
                hmOne.put(nums1[i], 1);
            }
        }

        for(int i=0; i<nums2.length; i++){
            if(hmTwo.containsKey(nums2[i])){
                int of = hmTwo.get(nums2[i]);
                hmTwo.put(nums2[i], of+1);
            }
            else{
                hmTwo.put(nums2[i], 1);
            }
        }

        for(int i=0; i<nums1.length; i++){
            if(hmTwo.containsKey(nums1[i])){
                count1++;
            }
        }

        for(int i=0; i<nums2.length; i++){
            if(hmOne.containsKey(nums2[i])){
                count2++;
            }
        }

        arr[0] = count1;
        arr[1] = count2;

        return arr;
    }
}