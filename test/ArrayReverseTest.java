import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayReverseTest {
    @Test
    void reverse() {
        assertArrayEquals(new int[]{1}, ArrayReverse.reverse(new int[]{1}));
        assertArrayEquals(new int[]{2, 1}, ArrayReverse.reverse(new int[]{1, 2}));
        assertArrayEquals(new int[]{3, 2, 1}, ArrayReverse.reverse(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ArrayReverse.reverse(new int[]{1, 2, 3, 4, 5}));
    }
}
