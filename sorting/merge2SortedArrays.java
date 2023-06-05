package sorting;

public class merge2SortedArrays {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] arr = new int[m + n];
        int i = 0, j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
                k++;
            } else {
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }
        // to add remaining elements of arr1
        while (i < m) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        // to add remaining elements of arr2
        while (j < n) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7, 9, 11, 13 };
        int[] arr2 = { 2, 4, 6, 8, 10 };
        int[] arr3 = mergeArrays(arr1, arr2);
        printArray(arr3);

    }
}
