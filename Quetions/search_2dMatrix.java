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