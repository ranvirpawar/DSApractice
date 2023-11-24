
Search In A Row Wise And Column Wise Sorted Matrix
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target,

public class Solution {
	public static Pair search(int [][] matrix, int x) {
		// Write your code here.
        int row =0;
        int col = matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(x ==matrix[row][col] ){
                return new Pair (row,col);
            }else if( x < matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        return new Pair(-1,-1);
        
	}
}