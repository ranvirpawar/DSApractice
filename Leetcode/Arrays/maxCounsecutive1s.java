// 485. Max Consecutive Ones

// Given a binary array nums, return the maximum number of consecutive 1's in the array.
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
            }
            else if ( nums[i] != 1){
                count = 0;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}
