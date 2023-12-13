package sorting;

import java.util.*;

public class mergeSort {
    public static void mergesort(int arr[], int low, int high) {
        if (low >= high)
            return;

        int mid = (low + high) / 2;

        mergesort(arr, low, mid);
        mergesort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    public static void merge(int arr[], int low, int mid, int high) {
        //
        ArrayList <Integer>list = new ArrayList<>();

        int left = 0;
        int right = mid + 1;

        // inserting smaller elements

        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }
        // adding left if remaining

        while (left <= mid) {
            list.add(arr[left]);
            left++;
        }

        // adding right if remaining

        while (right <= high) {
            list.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 73, 24, 6, 62, 42, 2, 8, 85, 24, 55, 8, 888, 56, 89, 94, 35 };
        mergesort(arr, 0, arr.length - 1);
        for (int c : arr) {
            System.out.print(c + ", ");
        }
    }
}
