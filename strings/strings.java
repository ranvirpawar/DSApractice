package strings;

public class strings {

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
            if(str.charAt(i) != str.charAt(j)){
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

    public static void main(String[] args) {
        System.out.println(checkPalindrome());
    }
}
