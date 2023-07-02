// 509. Fibonacci Number
// F(0) = 0, F(1) = 1
// F(n) = F(n - 1) + F(n - 2), for n > 1.
// Given n, calculate F(n).


class Solution {
    public int fib(int n) {
        if( n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}

public class fibbonacci_number {
    public int fib(int n) {
    if (n == 0) {
        return 0;
    } else if (n == 1) {
        return 1;
    } else {
        int[] f = new int[n];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < n; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f[n-1] + f[n-2];
    }
}

    
    public static void main(String[] args) {
        int n = 4;
        System.out.println(new Solution().fib(n)); 
    }
}
