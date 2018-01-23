import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayRotateByTest {
    @Test
    void rotateBy() {
        assertArrayEquals(new int[]{3, 4, 5, 6, 7, 1, 2}, ArrayRotateBy.rotateBy(new int[]{1, 2, 3, 4, 5, 6, 7}, 2));
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, ArrayRotateBy.rotateBy(new int[]{1, 2, 3, 4, 5, 6, 7}, 4));
        assertArrayEquals(new int[]{2, 3, 4, 5, 6, 7, 1}, ArrayRotateBy.rotateBy(new int[]{1, 2, 3, 4, 5, 6, 7}, 1));
    }
}
