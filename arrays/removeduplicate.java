package arrays;

import java.util.ArrayList;


public class removeduplicate {
    public static int removeduplicateTwoPointers(int [] nums){

        int n = nums.length;
        int i=0;
        for(int j=1; j<n; j++){
            if(nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;

    }



    public static void remove(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> alist = new ArrayList<>(10);
        alist.add(nums[0]);
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                alist.add(nums[i]);
            }
        }
        for (int c : alist) {
            System.out.println(c + ",");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 10, 20, 20, 30, 40, 50, 50 };
        // remove(nums);

        removeduplicateTwoPointers(nums);
        for(int c: nums){
            System.out.print(c + ", ");
        }
    }

}
