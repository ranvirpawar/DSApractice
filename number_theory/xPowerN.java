package number_theory;

public class xPowerN {
    static int power(int x, int n){
        if (n == 1) {
            return x;
        }
        int ans = x * power(x, n-1);
        return ans;
        
    }
    public static void main(String[] args) {
        int n = 10;
        int x = 5;
        int ans = 1;

        for(int i=1; i<=n; i++){
            ans = ans * x;
        }
        System.out.println(ans + "ans by itereative approach");
        System.out.println(power(x,n));

    }
    
}
