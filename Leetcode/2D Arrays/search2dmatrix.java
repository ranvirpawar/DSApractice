// 74. Search a 2D Matrix
// You are given an m x n integer matrix matrix with the following two properties:

// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.

// You must write a solution in O(log(m * n)) time complexity.


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0; int col=matrix[0].length-1;
        while(row<matrix.length&& col>=0){
            if (matrix[row][col]==target){
                return true;
            }
            else if( target< matrix[row][col]){
              col--;
            }
            else {
                row++;
            }

        }
        return false;
    }
    public static void main(String[]args){
        int matrix [][] ={ { 3, 12, 9 },
                        { 5, 2, 89 },
                        { 90, 45, 22 } };;
        int target = 5;
        Solution sl = new Solution();
        sl.searchMatrix(matrix, target);
    }
}


// 240. Search a 2D Matrix II
// Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

// Integers in each row are sorted in ascending from left to right.
// Integers in each column are sorted in ascending from top to bottom.

class ssolution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row =0, col= matrix[0].length-1;
        while( row<matrix.length && col>=0 ){
            if (matrix[row][col]== target){
                return true;
            }
            else if( target <matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
    public static void main(String[]args){
        int [][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 4;
        Solution sl = new Solution();
        sl.searchMatrix (matrix, target);
    }
}