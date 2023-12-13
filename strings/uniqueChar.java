package strings;

import java.util.*;

/* Write a program to print all the unique characters in a String.
For instance, if the input string is “abcb”, the output will be
the characters ‘a’ and ‘c’ as they are unique. The character ‘b’
repeats twice and so it will not be printed.
*/

public class uniqueChar {
    static void firstUkchar(String s){
        LinkedHashSet <Character> set = new LinkedHashSet<>();
        for(int i=0; i<s.length(); i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
            }else{
                set.add(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c: set){
            sb.append(c);
        }
        String ans = sb.toString();
        System.out.println(ans);
        int index = -1;
        for(int i=0; i<s.length(); i++){
            if(ans.charAt(0) == s.charAt(i)){
             index = i;
             break;
            }
        }
        System.out.println(index);
    }
    public static void main(String[] args) {
        String s = "aabsscdeeql";
        //HashSet<Character> set = new HashSet<>();
        // to maintain the order we which we have inserted the elements 
        LinkedHashSet <Character> set = new LinkedHashSet<>();
        for(int i=0; i<s.length(); i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
            }else{
                set.add(s.charAt(i));
            }
        }
        for(char c : set){
            System.out.print(c + ", " );
        }
        
        
    }
}
