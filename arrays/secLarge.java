package arrays;

public class secLarge {

    public static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-1; j++) {
               if (arr[j-1] > arr[j]) {int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;}
            }
        }
        for (int c : arr) {
            System.out.print(c + ", ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 7, 3, 2, 6, 0, 6, 4, 7, 8, 20 };
        sortArr(arr);
        int large = arr[0];
        int secLarge = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                secLarge = large;
                large = arr[i];
            }
            if (arr[i] > secLarge && arr[i] < large) {
                secLarge = arr[i];
            }
        }
        // System.out.println("Largest No : " + large + " Second largest : " +
        // secLarge);

    }
}
