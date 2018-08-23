package sort;

import static sort.Swap.swap;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        if (arr == null || arr.length <= 1)
            return;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }
}
