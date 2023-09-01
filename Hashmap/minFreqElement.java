package Hashmap;

import java.util.*;

public class minFreqElement {
    public static void minFreElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int frequency = map.get(nums[i]);
                map.put(nums[i], frequency + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int max_value = 0;
        

        for (Map.Entry<Integer, Integer> c : map.entrySet()) {
            int key = c.getKey();
            int value = c.getValue();
            System.out.println(key + " ----> " + value);
            max_value = Math.max(value, max_value);
            


        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 2, 4, 5, 2, 6, 2, 1, 1, 1, 6, 6, 7, 8, 9, 9, 9, 6, };
        minFreElement(nums);
    }

}
