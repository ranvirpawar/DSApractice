// 53. Maximum Subarray

// Given an integer array nums, find the 
// subarray
//  with the largest sum, and return its sum.
//  Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6

 class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum =  nums[0];
        int currSum = nums[0];
        for(int i=1; i< nums.length; i++){
            currSum = Math.max(nums[i], currSum+nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
        
    }
    public static void main (String args[]){
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        Solution sl = new Solution();
        System.out.println(sl.maxSubArray(nums));
    }
}