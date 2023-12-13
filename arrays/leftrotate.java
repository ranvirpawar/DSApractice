package arrays;

public class leftrotate {
    static int[] leftRotatebyd(int d, int[] arr) {
        // copying elements d elements from an array
        
        int darray[] = new int[d];
        for (int i = 0; i < d; i++) {
            darray[i] = arr[i];
        }
        // shifting arr
        for (int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        }
        // copying darray
        for (int i = 0; i < d; i++) {
            arr[arr.length - d + i] = darray[i];
        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // by one place;
        // int temp = arr[0];
        // for (int i = 0; i < arr.length - 1; i++) {
        // arr[i] = arr[i + 1];
        // }
        // arr[arr.length - 1] = temp;
        int array[] = leftRotatebyd(3, arr);
        for (int k : array) {
            System.out.print(k + ", ");
        }
    }
}
