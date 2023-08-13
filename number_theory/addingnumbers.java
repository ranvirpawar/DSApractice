package number_theory;

public class addingnumbers {
    public static int reverseNumber(int num) {
        int sum = 0;
        while (num >= 10) {
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            num = sum;

        }
        return num;
    }

    public static int addDigits(int num) {
        int ans = 0;
        while (num > 0) {
            int lastdigit = num % 10;
            // adding last digit to reverese
            ans = ans + lastdigit;

        }
        return ans;
    }

    public static void main(String[] args) {
        // System.out.println(reverseNumber(383));
        System.out.println(38);

    }
}
