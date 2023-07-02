238. Product of Array Except Self
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        int productArray[] = new int[n];

// creating array of product from start
        prefix[0] = 1;
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1]*nums[i-1];
        }
// creating array of product from left
        suffix[n-1] = 1;
        for(int i=n-2; i>=0; i--){
            suffix[i] = suffix[i+1]*nums[i+1];
        }
// 
        for(int j=0; j<n; j++){
            productArray[j] = prefix[j]*suffix[j];
        }

        return productArray;

    }
}