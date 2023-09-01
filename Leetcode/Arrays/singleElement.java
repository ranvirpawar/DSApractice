// 136. Single Number


// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int count = map.getOrDefault(nums[i], 0);

            map.put(nums[i], count+1);            
        }
        int element = -1;
        for(int c: map.keySet()){
            int frequency = map.get(c);
            if(frequency == 1){
                element = c;
                break;
            }

        }
        return element;
    }
}