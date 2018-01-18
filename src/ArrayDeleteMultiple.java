import java.util.Arrays;

public class ArrayDeleteMultiple {

    public static int[] deleteMultiple(int[] arr, int index, int deleteCount) {
        if (deleteCount > arr.length - index) {
            throw new IndexOutOfBoundsException("Delete count is too large.");
        }
        for (int i = index; i < arr.length - deleteCount; i++) {
            arr[i] = arr[i + deleteCount];
        }
        for (int i = arr.length - deleteCount; i < arr.length; i++) {
            arr[i] = 0;
        }
        return arr;
    }
}
