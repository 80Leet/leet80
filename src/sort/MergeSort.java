package sort;

public class MergeSort {
    public static void mergeSort(int[] arr){
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int lo, int hi) {
        if (lo >= hi) return;
        int mid = (lo + hi) / 2;
        mergeSort(arr, lo, mid);
        mergeSort(arr, mid + 1, hi);
        merge(arr, lo, mid, hi);
    }

    private static void merge(int[] arr, int lo, int mid, int hi) {
        int size1 = mid - lo + 1;
        int size2 = hi - mid;

        int[] left = new int[size1];
        int[] right = new int[size2];

        for (int i = 0; i < size1; i++) {
            left[i] = arr[lo + i];
        }
        for (int i = 0; i < size2; i++) {
            right[i] = arr[mid + i + 1];
        }

        int i = 0, j = 0;
        while (i < size1 && j < size2) {
            if (left[i] < right[j])
                arr[lo++] = left[i++];
            else
                arr[lo++] = right[j++];
        }
        while (i < size1)
            arr[lo++] = left[i++];

        while (j < size2)
            arr[lo++] = right[j++];
    }
}
