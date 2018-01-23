import java.util.Arrays;

public class ArrayRotateBy {
    public static int[] rotateBy(int[] arr, int by) {

        for (int i = 0; i < by; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int tmp = arr[j];
                arr[j] = arr[(j + 1) % arr.length];
                arr[(j + 1) % arr.length] = tmp;
            }
        }

        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
