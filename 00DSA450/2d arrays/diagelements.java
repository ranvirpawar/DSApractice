public class diagelements {

    public static void print(int [][] matrix){
        System.out.println("principal diagonal");
        for(int i=0; i<matrix[0].length; i++){
            System.out.print(matrix[i][i] + ", ");
        }
        System.out.println();
        System.out.println("secondary diagonal");
        int k = matrix[0].length -1;
        for(int i=0; i<matrix[0].length; i++){
            System.out.print(matrix[i][k] + ", ");
            k--;
        }
    }
    public static void main(String[] args) {
        int matrix[][] = { {  1,   2,   3,   4},
                           {  5,   6,   7,  8},
                           {  9, 10, 11, 12},
                           { 13, 14, 15, 16},
                           { 17, 18, 19, 20}};
        print(matrix);
    }
}
