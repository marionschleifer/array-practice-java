import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayDeleteMultipleTest {
    @Test
    void deleteMultiple() {
        assertArrayEquals(new int[]{0}, ArrayDeleteMultiple.deleteMultiple(new int[]{1}, 0, 1));
//        assertArrayEquals(new int[]{1, 2}, ArrayDeleteMultiple.deleteMultiple(new int[]{1, 2}, 0, 3));
        assertArrayEquals(new int[]{1, 3, 0}, ArrayDeleteMultiple.deleteMultiple(new int[]{1, 2, 3}, 1, 1));
        assertArrayEquals(new int[]{1, 2, 5, 0, 0}, ArrayDeleteMultiple.deleteMultiple(new int[]{1, 2, 3, 4, 5}, 2, 2));
        assertArrayEquals(new int[]{1, 2, 3, 4, 0}, ArrayDeleteMultiple.deleteMultiple(new int[]{1, 2, 3, 4, 5}, 4, 1));
    }
}

