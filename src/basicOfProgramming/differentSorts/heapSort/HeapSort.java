package basicOfProgramming.differentSorts.heapSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HeapSort {
//todo Best case -> O(n); Average case, Worst case -> O(nlog(n))


    public static void main(String[] args) {
        int[] arr = {124, 235, 456, 123, 756, 476, 285, 998, 379, 108};
        Sorted(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void Sorted(int[] arr) {
        int length = arr.length;
        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(arr, length, i);
        }
        for (int i = length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int length, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < length && arr[left] > arr[largest])
            largest = left;
        if (right < length && arr[right] > arr[largest])
            largest = right;
        if (i != largest) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, length, largest);
        }
    }
}
