import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayZipTest {
    @Test
    void zip() {
        int[] longArr = new int[]{1, 3, 5, 0, 0, 0};
        int[] shortArr = new int[]{2, 4, 6};

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, ArrayZip.zip(longArr, shortArr, 3));
    }

    @Test
    void zipWithExtraSpace() {
        int[] longArr = new int[]{1, 3, 5, 0, 0, 0, 0, 0};
        int[] shortArr = new int[]{2, 4, 6};

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 0, 0}, ArrayZip.zip(longArr, shortArr, 3));
    }
}
