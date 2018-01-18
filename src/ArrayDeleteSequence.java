import java.util.Arrays;

public class ArrayDeleteSequence {
    public static int[] deleteSequence(int[] arr, int start, int end) {
        int deleteCount = end - start + 1;
        if (deleteCount > arr.length - start) {
            throw new IndexOutOfBoundsException("Delete count too large.");
        }
        for (int i = start; i < arr.length - deleteCount; i++) {
            arr[i] = arr[i + deleteCount];
        }
        for (int i = arr.length - deleteCount; i < arr.length; i++) {
            arr[i] = 0;
        }
        return arr;
    }
}
