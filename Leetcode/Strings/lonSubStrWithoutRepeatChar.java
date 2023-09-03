package Leetcode.Strings;

import java.util.HashSet;

public class lonSubStrWithoutRepeatChar {
    public static int maxSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
       int maxlen = 1;
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                maxlen = Math.max(maxlen, right-left);
            } 
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxlen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(maxSubstring(s));

    }
}
