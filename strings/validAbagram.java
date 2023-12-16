package strings;
/* 
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
*/
public class validAbagram {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int arr[] = new int[26];

        for(char ele : s.toCharArray()){
            arr[ele-'a']++;
        }

        for(char ele : t.toCharArray()){
            arr[ele-'a']--;
        }
        for(int i : arr){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char c = 'g';
        int n = c-'a';
        System.out.print(n);
    }
    
}
