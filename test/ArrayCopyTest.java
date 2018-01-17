import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCopyTest {
    @Test
    void copy() {
        int[] input = new int[]{1, 2, 3};
        int[] result = ArrayCopy.copy(input);
        assertArrayEquals(input, result);
        assertNotSame(input, result);
    }
}