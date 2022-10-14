package basicOfProgramming.differentSorts.selectionSort;

import java.util.Arrays;

public class SelectionSort {
//todo Best case,Average case, Worst case -> O(n^2)

    public static int[] selectionSort(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
//                    count++;
                }
                count++;
            }
        }
        System.out.println(count);
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {124, 235, 456, 123, 756, 476 , 285, 998, 108};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
