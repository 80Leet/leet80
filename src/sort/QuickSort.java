package sort;

public class QuickSort {
    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right)
            return;
        int mid = (left + right) / 2;
        int pivot = arr[mid];
        int index = partition(arr, left, right, pivot);
        quickSort(arr, left, index - 1);
        quickSort(arr, index, right);

    }

    private static int partition(int[] arr, int left, int right, int pivot){
        while (left <= right) {
            while (arr[left] < pivot)
                left++;
            while (arr[right] > pivot)
                right--;
            if (left <= right){
                Swap.swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public static void quick3Way(int[] arr){
        quick3Way(arr, 0, arr.length - 1);
    }

    private static void quick3Way(int[] arr, int left, int right) {
        if (left >= right) return;
        int lowIndex = left, highIndex = right;
        int pivot = arr[left];
        int i = lowIndex;
        while (i <= highIndex){
            if (arr[i] < pivot){
                Swap.swap(arr, lowIndex++, i++);
            }
            else if (arr[i] > pivot){
                Swap.swap(arr, i, highIndex--);
            }
            else {
                i++;
            }
        }
        quick3Way(arr, left, lowIndex - 1);
        quick3Way(arr, highIndex + 1, right);

    }
}
