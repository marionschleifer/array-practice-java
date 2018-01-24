public class ArrayRotateSequence {
    public static int[] rotateSequence(int[] arr, int start, int end) {

        for (int i = start; i <= end; i++) {
            swap(arr, i, (i + 1) % arr.length);
        }
        return arr;
    }

    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
