package Leetcode.Strings;

public class longestPalindromicSubStrign {
    public static String solution(String s) {

        String ans = "";
        int len = 0;

        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i;
            while (left >= 0 && right < s.length()) {
                String substr = s.substring(left, right + 1);
                if (len < substr.length()) {
                    ans = s.substring(left, right + 1);
                    len = right - left + 1;

                }
                left--;
                right++;

            }

        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "babad";
        System.out.println(solution(str));

    }
}
