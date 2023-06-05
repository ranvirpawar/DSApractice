package sorting;

public class insertion_sort {
    void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 3, 1, 4, 2, 7, 6 };
        insertion_sort is = new insertion_sort();
        is.sort(arr);
        printArray(arr);
    }
}
