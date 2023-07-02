// Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
public class power {

    public double pow(double x, int n) {
        double ans = 1.0;
        long nn = n;
        if (nn < 0) {
            nn = nn * -1;
        }
        while (nn > 0) {
            if (nn % 2 != 0) {
                ans = ans * x;
                nn = nn - 1;
            } else {
                ans = x * x;
                nn = nn / 2;
            }
        }
        if (n < 0) {
            ans = (double) (1.0) / (double) (ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        power aa = new power();
        System.out.println(aa.pow(2.11, 3));
    }

}
