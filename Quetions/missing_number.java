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