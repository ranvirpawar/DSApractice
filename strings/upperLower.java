package strings;

// Write a program in Java to Toggle the case of every character
// of a string. For instance, if the input string is “ApPLe”, the
// output should be “aPplE"

public class upperLower {
    public static void main(String[] args) {
        String str= "ApP78325lE";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i)<='Z'){
                sb.append((char)(str.charAt(i) + 32));
            }else if(str.charAt(i) >= 'a' && str.charAt(i)<='z'){
                sb.append((char)(str.charAt(i)-32));
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
