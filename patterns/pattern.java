public class pattern {
    /*
     * pattern 1
     ****
     ****
     ****
     */

    void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     * pattern 2
     * 
     * *
     * * *
     * * * *
     */
    void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
         ****
         ***
         **
         *
     */
    void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
     * 1
     * 12
     * 123
     * 1234
     */

    void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    // *
    // * *
    // * * *
    // * * * *

    void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            int s = n - row;
            for (int p = 1; p <= s; p++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // *
    // * *
    // * * *
    // * * * *
    // * * *
    // * *
    // *

    void pattern6(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int noofCol = row;
            if (row > n) {
                noofCol = 2 * n - row;
            }
            for (int col = 1; col <= noofCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // -----*
    // ----* *
    // ---* * *
    // --* * * *
    // --- * * *
    // ----* *
    // ----- *
    void pattern7(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int noOfspaces = n - row;
            if (row > n) {
                noOfspaces = row - n;
            }
            for (int s = 1; s <= noOfspaces; s++) {
                System.out.print(" ");
            }
            int noofCol = row;
            if (row > n) {
                noofCol = 2 * n - row;
            }
            for (int col = 1; col <= noofCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // -----1
    // ----212
    // ---32123
    // --4321234
    // -543212345
    void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            int noOfspaces = n - row;
            for (int col = 1; col <= noOfspaces; col++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println(" ");
        }
    }

     //  *
//      ***
//     *****
//     *******

void pattern9(){
int n = 7;
for(int row=1; row<=n; row++){
    int spaces = n-row;
    for(int col = 1; col<=spaces; col++){
        System.out.print(" ");
    }
    for(int col=1; col<= row; col++){
        System.out.print("*");
    }
    for (int col = 2; col <= row; col++) {
                System.out.print("*");
            }
    System.out.println();
    }
}


    void pattern9(int n){
        
    }

    public static void main(String Args[]) {
        pattern p = new pattern();
        p.pattern9();
    }

}
