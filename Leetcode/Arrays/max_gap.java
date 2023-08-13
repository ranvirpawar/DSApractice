public class max_gap {
    
}
// Given an integer array nums, return the maximum difference between two successive elements in its sorted form. If the array contains less than two elements, return 0.

// You must write an algorithm that runs in linear time and uses linear extra space.

class Solution {
    public int maximumGap(int[] nums) {
        int maxdiff = 0;
        if(nums.length < 2){
            return 0;
        }
        Arrays.sort(nums);
        for (int i=1; i<nums.length; i++){
            // if (nums[i]> nums[i-1]){
                maxdiff = Math.max(maxdiff, nums[i]-nums[i-1]);
            // }
        }
        return maxdiff;


        
    }
}