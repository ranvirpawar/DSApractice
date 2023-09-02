import java.util.Arrays;

class consequitiveSubsquence {
    public static void sq(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int maxlength = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 1) {
                count++;

            } else if (nums[i] != nums[i - 1] ) {
                count = 1;
            }
            maxlength = Math.max(count, maxlength);

        }
        System.out.println(maxlength);
    }

    public static void main(String[] args) {
        int nums[] = { 100, 4, 5, 200, 11, 12, 13, 14, 15, 16, 17, 1, 3, 2 };
        sq(nums);
    }
}