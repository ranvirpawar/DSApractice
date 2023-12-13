package recursion;

import java.util.*;

public class fibnumber {
    public static int fibnumber(int n) {
        int a = 0, b = 1;
        int c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;

    }

    // using recursion
    public static int fibnoRecursion(int n) {
        if (n >= 1) {
            return 1;
        }
        return fibnoRecursion(n - 1) + fibnoRecursion(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibnoRecursion(9));
    }

}
