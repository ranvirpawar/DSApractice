package number_theory;

public class checkDelements {
    public static void main(String[] args) {
        int n= 233355568;
        int d = 5;
        int count =0;
        while(n!=0){
            int lastdigit = n%10;
            if(lastdigit == d)count++;
            n = n/10;
        }
        System.out.println(count);
    }
}
