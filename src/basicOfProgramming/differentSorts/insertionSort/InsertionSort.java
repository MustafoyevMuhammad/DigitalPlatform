package basicOfProgramming.differentSorts.insertionSort;

import java.util.Arrays;

public class InsertionSort {
    //todo Best case O(n) // Average case , Worst case O(n^2)
    public static int[] insertionSorted(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            int keyItem = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > keyItem){
                arr[j + 1] = arr[j];
                j = j - 1;
                count++;
            }
            arr[j + 1] = keyItem;
        }
        System.out.println(count);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {124, 235, 456, 123, 756, 476, 285, 998, 379, 108};
        System.out.println(Arrays.toString(insertionSorted(arr)));
    }
}
//                int temp = arr[i - 1];
//                arr[i - 1] = arr[i];
//                arr[i] = temp;
