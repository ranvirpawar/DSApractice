// N = 4 , M = 4
// Arr[][] = {{0, 1, 1, 1},
//            {0, 0, 1, 1},
//            {1, 1, 1, 1},
//            {0, 0, 0, 0}}
// Output: 2
// Explanation: Row 2 contains 4 1's (0-based
// indexing).

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int startRow = 0;
        int endRow = n - 1;
        int maxCount = 0;
        int rowWithmax1 = -1;
        while (startRow <= endRow) {
            int count = 0;
            for (int i = 0; i < m; i++) {
                if (arr[startRow][i] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                rowWithmax1 = startRow;
            }
            startRow++;
        }
        return rowWithmax1;
    }
}