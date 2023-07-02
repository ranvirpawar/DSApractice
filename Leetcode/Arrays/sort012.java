// 75. Sort Colors
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.



class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0;
        int nextZero = 0;
        int nextTwo = n - 1;
        while (i <= nextTwo) {
            if (nums[i] == 0) {
                int temp = nums[nextZero];
                nums[nextZero] = nums[i];
                nums[i] = temp;
                i++;
                nextZero++;
            } else if (nums[i] == 2) {
                int temp = nums[nextTwo];
                nums[nextTwo] = nums[i];
                nums[i] = temp;
                // i++;
                nextTwo--;
            } else {
                i++;
            }
        }
    }
}