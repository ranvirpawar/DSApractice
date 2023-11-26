class example {
    static int multiplication(int a, int b) {
        int ans = 0;
        if (a < b) {
            for (int i = 0; i < a; i++) {
                ans += b;
            }
        } else {
            for (int i = 0; i < b; i++) {
                ans += a;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int a = 3;
        int b = 20;
        System.out.println(multiplication(a, b));
    }
}