public class ArrayContainsArray {
    public static boolean containsArray(int[] arr, int[] subArr) {
        if (subArr.length > arr.length) {
            arr = subArr;
            subArr = arr;
        }

        int lastPossibleOffset = arr.length - subArr.length;
        for (int offset = 0; offset <= lastPossibleOffset; offset++) {
            if (containsArray(arr, subArr, offset)) return true;
        }
        return false;
    }

    private static boolean containsArray(int[] arr, int[] subArr, int offset) {
        for (int i = 0; i < subArr.length; i++) {
            if (arr[i + offset] != subArr[i]) return false;
        }
        return true;
    }
}
