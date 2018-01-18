import java.util.Arrays;

public class ArrayDeleteMultiple {

    public static int[] deleteMultiple(int[] arr, int index, int count) {
        if(arr.length == 1) {
            arr[0] = 0;
            return arr;
        }
        if(count > arr.length - index) {
            throw new IndexOutOfBoundsException("Array is smaller than count");
        }
        for(int i = index; i < arr.length - count; i++) {
            arr[i] = arr[i + count];
            System.out.println(Arrays.toString(arr));
        }
        for(int i = arr.length - count; i < arr.length; i++) {
            arr[i] = 0;
        }
        return arr;
    }
}
