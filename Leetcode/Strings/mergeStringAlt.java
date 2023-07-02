// 1768. Merge Strings Alternately
// Easy
// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

// Return the merged string.
// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"

class Solution {
    public String mergeAlternately(String word1, String word2) {
        String merge= "";
        int i =0;
        int j=0;
        while(i<(word1.length())&& j<(word2.length())){
            merge += word1.charAt(i);
            merge += word2.charAt(j);
            i++;
            j++;
        }
        // still if some elements are remained then add adding remaining those
        if(i<(word1.length())){
            merge +=word1.substring(i);
         }
        else if(j<word2.length()){
            merge += word2.substring(j);
        }
        return merge;
    }
}