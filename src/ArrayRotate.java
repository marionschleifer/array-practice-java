public class ArrayRotate {

    public static int[] rotate(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++) {
            int tmp = arr[i];
            arr[i] = arr[(i+1) % arr.length];
            arr[(i+1) % arr.length] = tmp;
        }

        return arr;
    }
}
