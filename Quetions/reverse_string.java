class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");

        // Reverse the order of the words in the list.
        int n = words.length;
        for (int i = 0; i < n / 2; i++) {
            String temp = words[i];
            words[i] = words[n - 1 - i];
            words[n - 1 - i] = temp;
        }

        // Join the words back into a string.
        return String.join(" ", words).trim();
    }

}