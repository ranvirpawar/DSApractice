 import java.util.*;
public class wavePrint {

    public static void print(int[][] matrix){
        int sr = 0;
        int er = matrix.length-1;
        int sc = 0;
        int ec = matrix[0].length -1;

        while(sc<= ec){
            for(int i=sr;i<=er; i++){
            System.out.print(matrix[i][sc] + ", ");
        }
        sc++;
        for(int i=er; i>=sr; i--){
            System.out.print(matrix[i][sc] + ", ");
        }
        sc++;
        
     }
        
    }

    public static void print2(int[][] matrix){
        System.out.println();
        for(int i=0; i<matrix[0].length; i++){
            if(i%2 == 0){
                for(int j = 0; j<= matrix.length -1; j++){
                    System.out.print(matrix[j][i] + ", ");
                }
            }else{
                for (int j=matrix.length-1; j>=0; j--){
                    System.out.print(matrix[j][i] +", ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][] = { {  1,   2,   3,   4},
                           {  5,   6,   7,  8},
                           {  9, 10, 11, 12},
                           { 13, 14, 15, 16},
                           { 17, 18, 19, 20}};
                           
        print(matrix);
        print2(matrix);



    }
    
}
