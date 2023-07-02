// Question 540. Single Element in a Sorted Array
// You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

// Return the single element that appears only once.

// Your solution must run in O(log n) time and O(1) space.

 

// Example 1:

// Input: nums = [1,1,2,3,3,4,4,8,8]
// Output: 2
// Example 2:

// Input: nums = [3,3,7,7,10,11,11]
// Output: 10

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left =0;
        int right = nums.length-1;
        if(nums.length == 1){
            return nums[0];
        }
        if(nums[0] != nums[1]){
            return nums[0];
        }
        if(nums[right]!= nums[right-1]){
            return nums[right];
        }
        while (left < right){
           int mid = left + (right - left) / 2;

            if (mid % 2 == 1) {
                mid--; // Adjust mid to even index
            }
            if(nums[mid] == nums[mid+1]){
                left = mid + 2;
            }
            else if ( nums[mid] == nums[mid-1]){
               right = mid-2;
            }
            else {
                return nums[mid];
            }
        }

       return nums[left];
    }
}