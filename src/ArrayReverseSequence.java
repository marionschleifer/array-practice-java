import java.util.Arrays;

public class ArrayReverseSequence {
    public static int[] reverseSequence(int[] arr, int start, int end) {
        int reverseLength = end - start + 1;
        int last = end;
        for (int i = start; i < start + (reverseLength / 2); i++) {
            swap(arr, i, last--);
        }
        return arr;
    }


    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
