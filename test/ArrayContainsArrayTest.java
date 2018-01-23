import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayContainsArrayTest {

    @Test
    void containsArray() {
        assertEquals(false, ArrayContainsArray.containsArray(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{8, 9}));
        assertEquals(true, ArrayContainsArray.containsArray(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{3, 4}));
        assertEquals(true, ArrayContainsArray.containsArray(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{1, 2, 3, 4}));
        assertEquals(false, ArrayContainsArray.containsArray(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{0, 1, 2, 3, 4}));
        assertEquals(false,
                ArrayContainsArray.containsArray(
                        new int[]{1, 2, 3, 4, 5, 6, 7},
                        new int[]{1, 2, 7}));
    }

}
