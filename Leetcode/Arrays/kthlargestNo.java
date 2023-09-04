package Leetcode.Arrays;

import java.util.*;

public class kthlargestNo {
    public static void main(String[] args) {
        int nums[] = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        Arrays.sort(nums);
        int j = 1;
        for (int i = nums.length -1; i >= 0; i--) {
            if (j == k) {
                System.out.println(nums[i]);
                break;
            } else {
                j++;
            }
        }
    }

}
