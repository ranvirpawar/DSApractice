class patterns {
    public static void main(String[] args) {
        // to print
        // 9
        // 66
        // 333
        // int num = 9;
        // for (int i = 1; i <= 3; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(num);

        // }
        // num -= 3;
        // System.out.println();
        // }

        // to print
        // System.out.println(" 999 666666 333333333 ");
        int k = 3;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3 * i; j++) {
                System.out.print(i);
            }
            k += 3;
            System.out.println();

        }

    }

}
