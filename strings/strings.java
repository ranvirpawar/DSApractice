package strings;

 class strings {

    public static boolean checkPalindrome() {
        String str = "asdssa";
        // String reverse = "";
        // for (int i = str.length() - 1; i >= 0; i--) {
        // reverse += str.charAt(i);
        // }
        // if (reverse.equals(str)) {
        // System.out.println("Given String is Palindrome");
        // } else {
        // System.out.println("Is Not Palindrome");
        // }

        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;

            }
            i++;
            j--;
        }
        return true;

    }

    public static void reversestring() {
        String str = "ranvir";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.print("the reverse of given string 'ranvir' is " + reverse);
    }

    public static void reverseEachWord(String str) {

        String ans = " ";
        for (int i = 0; i < str.length(); i++) {
            int currentWordStart = 0;
           

            // check if space occured

            if (str.charAt(i) == ' ') {
                // now reverse the word
                int currentWordEnd = i - 1;
                String reverseWord = " ";
                for (int j = currentWordStart; j <= currentWordEnd; j++) {
                    reverseWord = str.charAt(j) + reverseWord;
                }
                ans += reverseWord + " ";
                currentWordStart = i + 1;
            }

        }

        System.out.println(ans);

    }

    public static void main(String[] args) {
        // System.out.println(checkPalindrome());
        String str = " hello Ranvir this is demo";
        reverseEachWord(str);
    }
}
