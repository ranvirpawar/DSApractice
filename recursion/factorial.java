package recursion;

public class factorial {
    public int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int smallProblem = n - 1;
        return n * fact(smallProblem);
    }

    public static void main(String[] args) {
        int n = 4;
        int ans = new factorial().fact(n);
        System.out.println(ans);

    }
}
