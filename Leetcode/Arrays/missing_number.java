// 268. Missing Number
// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
// Example 1:

// Input: nums = [3,0,1]
// Output: 2
// Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

class Solution {
    public int missingNumber(int[] nums) {
        int N = nums.length;
        boolean hasZero = false;
        for (int i = 0; i < N; i++) {
            if (nums[i] == 0) {
                hasZero = true;
            }
        }
        if (hasZero == false) {
            return 0;
        }
        for (int i = 1; i <= N; i++) {
            int flag = 0;
            for (int j = 0; j < N; j++) {
                if (nums[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return i;
            }
        }
        return -1;
    }
}