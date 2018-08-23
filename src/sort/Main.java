package sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] unsort = {3,2,6,4,0,5,1};
        QuickSort.quick3Way(unsort);
        System.out.println(Arrays.toString(unsort));
    }
}
