import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayDeleteSequenceTest {
    @Test
    void deleteSequence() {
        assertArrayEquals(new int[]{0}, ArrayDeleteSequence.deleteSequence(new int[]{1}, 0, 0));
        assertArrayEquals(new int[]{0, 0}, ArrayDeleteSequence.deleteSequence(new int[]{1, 2}, 0, 1));
        assertArrayEquals(new int[]{1, 0, 0}, ArrayDeleteSequence.deleteSequence(new int[]{1, 2, 3}, 1, 2));
        assertArrayEquals(new int[]{4, 5, 6, 0, 0, 0}, ArrayDeleteSequence.deleteSequence(new int[]{1, 2, 3, 4, 5, 6}, 0, 2));
        assertArrayEquals(new int[]{1, 2, 3, 4, 0, 0}, ArrayDeleteSequence.deleteSequence(new int[]{1, 2, 3, 4, 5, 6}, 4, 5));
    }
}
