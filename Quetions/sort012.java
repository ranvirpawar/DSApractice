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