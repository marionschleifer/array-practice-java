public class ArrayRotateSequence {
    public static int[] rotateSequence(int[] arr, int start, int end) {
        int tmp = arr[start];
        for (int i = start; i <= end; i++) {
            arr[i] = arr[(i + 1) % arr.length];
        }
        arr[end] = tmp;
        return arr;
    }
}
