import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayReverseIntervalsTest {
    @Test
    void reverseIntervals() {
        assertArrayEquals(new int[]{3, 2, 1, 6, 5, 4, 9, 8, 7}, ArrayReverseIntervals.reverseIntervals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3));
        assertArrayEquals(new int[]{2, 1, 4, 3, 6, 5, 8, 7, 9}, ArrayReverseIntervals.reverseIntervals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 2));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, ArrayReverseIntervals.reverseIntervals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 1));
        assertArrayEquals(new int[]{4, 3, 2, 1, 8, 7, 6, 5, 9}, ArrayReverseIntervals.reverseIntervals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 4));
    }
}
