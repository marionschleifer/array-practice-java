import java.util.ArrayList;
import java.util.Arrays;

public class ArrayInsertPeriodically {
    public static void insertPeriodically(int[] arr, int interval, int number, int arrayLength) {
        int newSize = arr.length + (arr.length / interval);
        int startArray = arr.length - arrayLength;

        for(int i = 0; i < arrayLength; i++) {
            ArrayInsertPeriodically.rotate(arr);
        }

        int currentIndex = 0;
        for(int i = 0; i < arrayLength / interval; i++) {
            for(int j = 0; j <= interval; i++) {

            }
//            arr[currentIndex] = arr[startArray];
//            arr[currentIndex + 1] = arr[startArray + 1];
//            arr[currentIndex + 2] = 42;
//            currentIndex += interval;
        }


        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr) {
        int tmp = arr[0];

        for(int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = tmp;
    }


}

