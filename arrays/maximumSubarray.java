package arrays;

import java.util.*;

public class maximumSubarray {

    public static int[] printSubarray(int arr[]) {

        /// we will use kadanes algorithm
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        // creating 3 pointers
        int current = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > maxSum) {
                maxSum = sum;
                start = current;
                end = i;
            }

            //
            if (sum < 0) {
                sum = 0;
                current = i + 1;
            }
        }

        // printing array using
        int subarray[] = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            subarray[i - start] = arr[i];
        }
        return subarray;

    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int subarray[] = printSubarray(arr);
        for (int c : subarray) {
            System.out.print(c + ", ");
        }

    }

}
