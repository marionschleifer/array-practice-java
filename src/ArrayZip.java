import java.util.Arrays;

public class ArrayZip {

    public static int[] zip(int[] longArr, int[] shortArr, int realArrLength) {
        for (int i = realArrLength - 1; i > 0; i--) {
            longArr[i * 2] = longArr[i];
        }

        for (int i = 0; i < realArrLength; i++) {
            longArr[1 + i * 2] = shortArr[i];
        }

        return longArr;
    }
}
