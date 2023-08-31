package sorting;

class selection_sort {
    static void selection_sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minValue = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int j = i; j < n; j++) {
                // finding minimum value in the array 
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            // swaping elements of i position to minIndex
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 3, 1, 4, 2, 7, 6 };
        selection_sort(arr);
        printArray(arr);

    }
}

