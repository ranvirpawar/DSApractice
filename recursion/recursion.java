package recursion;

public class recursion {
    public int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int smallProblem = n - 1;

        return n * fact(smallProblem);

    }

    // sum of n natural numbers
    public static int sum(int n) {
        if (n == 1) {
            return n;
        }
        return n + sum(n - 1);
    }

    // calculate the power
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    // count the number of digits in number
    public static int count(int n) {
        if (n == 0) {
            return 0;
        }
        int smallCase = count(n / 10);
        // int ans = 1 + smallCase;
        return smallCase + 1;

    }

    // print n numbers given in range 1, n
    public static void printNumbers(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printNumbers(n - 1);
        System.out.print(n + " ");
    }

    // count number of zeros
    public static int countZeros(int n) {
        if (n < 10) {
            if (n == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        if (n % 10 == 0) {
            return 1 + countZeros(n / 10);
        } else {
            return countZeros(n / 10);
        }
    }

    // multiplication without using *
    public static int multiplication(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        int ans = m + multiplication(m, n - 1);
        return ans;

    }

    public static void main(String[] args) {
        // int n = 5;
        // int ans = new recursion().fact(n);
        // System.out.println(ans);
        // System.out.println(sum(n));
        // System.out.println(power(3, n));
        // printNumbers(7);
        // System.out.println(count(1234567890));
        // myPow(3.1243, 78);
        // System.out.println(multiplication(1000, 4));
        System.out.println(countZeros(102034005));
    }
}
