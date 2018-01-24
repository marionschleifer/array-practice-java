public class ArrayReverseIntervals {
    public static int[] reverseIntervals(int[] arr, int interval) {
        int lastPossibleOffset = arr.length - interval;

        for (int start = 0; start <= lastPossibleOffset; start += interval) {
            reversePart(arr, start, interval);
        }
        return arr;

    }

    private static void reversePart(int[] arr, int first, int interval) {
        int last = first + interval - 1;
        for (int i = first; i < first + interval / 2; i++) {
            swap(arr, i, last--);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
