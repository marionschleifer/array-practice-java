public class ArrayRotate {

    public static int[] rotate(int[] arr) {
        int tmp = arr[0];

        for(int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[(i+1) % arr.length];
        }
        arr[arr.length - 1] = tmp;
        return arr;
    }
}
