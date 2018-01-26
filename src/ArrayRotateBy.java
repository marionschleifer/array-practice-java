import java.util.Arrays;

public class ArrayRotateBy {
    public static int[] rotateBy(int[] arr, int by) {
        for (int i = 0; i < by; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                swap(arr, j, (j + 1) % arr.length);
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
