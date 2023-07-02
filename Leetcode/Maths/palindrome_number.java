// 9. Palindrome Number

// Given an integer x, return true if x is a 
// palindrome
// , and false otherwise.

class Solution {
    public boolean isPalindrome(int x) {
        int reverseNo = 0;
        int originalNo = x;
        if (x < 0) {
            return false;
        }
        while (x > 0) {
            int lastDigit = x % 10;
            reverseNo = reverseNo * 10 + lastDigit;
            x = x / 10;

        }
        return reverseNo == originalNo;

    }
}