package number_theory;

public class palindromeNo {
    public static void main(String[] args) {
        int original = 16461;
                int n = original;
        
        int reverseNo=0;
    
        while( n > 0){
            int lastDigit = n%10;
            reverseNo = (reverseNo*10) + lastDigit;
            n = n/10;
        }
        System.out.println(n + " : n");
        System.out.println(reverseNo + " : reverseNo");
        if(reverseNo == original){
            System.out.println("given no is palindrome");
        }else{
            
            System.out.println("no");
        }
            
       
    }
}
