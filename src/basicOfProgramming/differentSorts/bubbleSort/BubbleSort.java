package basicOfProgramming.differentSorts.bubbleSort;

import java.util.Arrays;

public class BubbleSort {
    //Best case todo ->O(n) // Average case, Worst case -> O(n^2)

    public static int[]  withBubbleSort(int[] arr){
        boolean needIteration = true;
        while(needIteration){
            needIteration = false;
            for (int j = 1; j < arr.length; j++) {
                if(arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    needIteration = true;
                }
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {124, 235, 456, 123, 756, 476 , 285, 998, 108};
        System.out.println(Arrays.toString(withBubbleSort(arr)));
    }
}
