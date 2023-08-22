
package number_theory;

import java.util.Arrays;

public class countPrimes {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {

                return false;
            }
        }
        return true;
    }

    public static int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;

    }

    public static int countPrimeBetterapproach(int n) {
        boolean[] barray = new boolean[n + 1];
        Arrays.fill(barray, true);
        barray[0] = false;
        barray[1] = false;
        for (int i = 0; i * i < n; i++) {
            for (int j = i*i;  j <n; j += i) {
                barray[j] = false;

            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (barray[i] == true) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int n = 10;
        // System.out.println(countPrimes(n));
        int ans = countPrimeBetterapproach(n);
        System.out.println(ans);

    }
}
