package number_theory;
import java.util.*;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int reverseNo = 0;
        while(n !=0){
            int lastDigit = n%10;
            reverseNo = reverseNo*10 + lastDigit;
            n = n/10;
        }
        System.out.println(reverseNo);
    }
}
