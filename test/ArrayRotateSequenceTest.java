import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayRotateSequenceTest {
    @Test
    void rotateSequence() {
        assertArrayEquals(new int[]{1, 2, 4, 5, 3, 6, 7}, ArrayRotateSequence.rotateSequence(new int[]{1, 2, 3, 4, 5, 6, 7}, 2, 4));
    }
}
