import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayDeleteElementTest {
    @Test
    void deleteElement() {
        assertArrayEquals(new int[]{0}, ArrayDeleteElement.deleteElement(new int[]{1},0));
        assertArrayEquals(new int[]{1, 0}, ArrayDeleteElement.deleteElement(new int[]{1, 2},1));
        assertArrayEquals(new int[]{2, 0}, ArrayDeleteElement.deleteElement(new int[]{1, 2},0));
        assertArrayEquals(new int[]{1, 2, 4, 0}, ArrayDeleteElement.deleteElement(new int[]{1, 2, 3, 4},2));
        assertArrayEquals(new int[]{1, 2, 3, 4, 6, 0}, ArrayDeleteElement.deleteElement(new int[]{1, 2, 3, 4, 5, 6},4));
        assertArrayEquals(new int[]{2, 3, 4, 5, 6, 0}, ArrayDeleteElement.deleteElement(new int[]{1, 2, 3, 4, 5, 6},0));
    }
}
