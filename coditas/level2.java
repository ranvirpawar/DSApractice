import java.util.*;
import java.math.BigInteger;
class level2 {

    public static BigInteger fact(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    public static int countZero(BigInteger n) {

        // count zero
        if (n.equals(BigInteger.ZERO)) {
            return 1;
        }
        int count = 0;

        while (n.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            count++;
            n = n.divide(BigInteger.TEN);
        }

        return count;

    }

    public static void main(String[] args) {

        int n = 1003;
        System.out.println("fact : " + fact(n));

        System.out.println(countZero(fact(n)));

    }

    
}