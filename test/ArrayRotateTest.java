import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayRotateTest {
    @Test
    void rotate() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(new int[]{2, 3, 4, 5, 1}, ArrayRotate.rotate(arr));
        assertArrayEquals(new int[]{3, 4, 5, 1, 2}, ArrayRotate.rotate(arr));
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, ArrayRotate.rotate(arr));
    }
}
