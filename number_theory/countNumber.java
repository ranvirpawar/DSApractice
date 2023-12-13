package number_theory;

public class countNumber {
    public static void main(String[] args) {
        long n=4567835;
        int count = 0;
        while(n!=0){
           
            count++;
            n = n/10;
        }
        System.out.println("count is " + count);
    }
}
