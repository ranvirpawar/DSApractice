class Solution {
    public int search(int[] nums, int target) {
        int N = nums.length;
        int start = nums[0];
        int end = N - 1;
        if (N == 1 && nums[0] == target) {
            return 0;
        }
        if (N == 2) {
            if (target == nums[0]) {
                return 0;
            } else if (target == nums[1]) {
                return 1;
            }
        }
        while (start <= end) {

            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

}