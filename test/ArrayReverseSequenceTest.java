import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayReverseSequenceTest {
    @Test
    void reverseSequence() {
        assertArrayEquals(new int[]{1, 5, 4, 3, 2, 6, 7}, ArrayReverseSequence.reverseSequence(new int[]{1, 2, 3, 4, 5, 6, 7}, 1, 4));
        assertArrayEquals(new int[]{1, 2, 3, 7, 6, 5, 4}, ArrayReverseSequence.reverseSequence(new int[]{1, 2, 3, 4, 5, 6, 7}, 3, 6));
        assertArrayEquals(new int[]{7, 6, 5, 4, 3, 2, 1}, ArrayReverseSequence.reverseSequence(new int[]{1, 2, 3, 4, 5, 6, 7}, 0, 6));
    }
}
