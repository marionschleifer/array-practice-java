import java.util.Arrays;

public class ArrayContainsArray {
    public static boolean containsArray(int[] arr, int[] subArr) {
        if (subArr.length > arr.length) {
            arr = subArr;
            subArr = arr;
        }

        int hash = calculateHash(subArr);

        int lastPossibleOffset = arr.length - subArr.length;
        for (int i = 0; i <= lastPossibleOffset; i++) {
            if (checkWindow(arr, subArr, i, hash)) return true;
        }
        return false;
    }

    public static int calculateHash(int[] arr) {
        int hash = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 3;
            hash += arr[i];
        }
        return hash;
    }

    public static boolean checkWindow(int[] arr, int[] subArr, int i, int hash) {
        int[] window = new int[subArr.length];
        System.arraycopy(arr, i, window, 0, subArr.length);
        return (calculateHash(window) == hash);
    }


//    public static boolean containsArray(int[] arr, int[] subArr) {
//        if (subArr.length > arr.length) {
//            arr = subArr;
//            subArr = arr;
//        }
//
//        int lastPossibleOffset = arr.length - subArr.length;
//        for (int offset = 0; offset <= lastPossibleOffset; offset++) {
//            if (containsArray(arr, subArr, offset)) return true;
//        }
//        return false;
//    }
//
//    private static boolean containsArray(int[] arr, int[] subArr, int offset) {
//        for (int i = 0; i < subArr.length; i++) {
//            if (arr[i + offset] != subArr[i]) return false;
//        }
//        return true;
//    }
}
