package algorithmics.searchrotatedarray;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SearchRotatedTest {
    private int[] array;

    private int[] rotate(int[] array, int rotations) {
        int len = array.length;
        int[] rotatedArray = new int[len];

        for (int i = 0; i <= len - 1; i++) {
            rotatedArray[(i + rotations) % len] = array[i];
        }

        return rotatedArray;
    }

    @BeforeEach
    public void init() {
        array = new int[]{1, 10, 20, 47, 59, 63, 75, 88, 99, 107, 120, 133, 155, 162, 176, 188, 199, 200, 210, 222};
    }

    @Test
    public void testCase0() {
        int[] rotatedArray = new int[]{176, 188, 199, 200, 210, 222, 1, 10, 20, 47, 59, 63, 75, 88, 99, 107, 120, 133, 155, 162};

        assertArrayEquals(rotatedArray, rotate(array, 6));
    }

    @Test
    public void testCase1() {
        array = rotate(array, 6);

        assertEquals(-1, SearchRotated.binarySearchRotated(array, 0));
    }

    @Test
    public void testCase2() {
        array = rotate(array, 6);

        assertEquals(9, SearchRotated.binarySearchRotated(array, 47));
    }

    @Test
    public void testCase3() {
        array = rotate(array, 6);

        assertEquals(6, SearchRotated.binarySearchRotated(array, 1));
    }

    @Test
    public void testCase4() {
        array = rotate(array, 6);

        assertEquals(2, SearchRotated.binarySearchRotated(array, 199));
    }

    @Test
    public void testCase5() {
        array = rotate(array, 6);

        assertEquals(14, SearchRotated.binarySearchRotated(array, 99));
    }

    @Test
    public void testCase6() {
        array = rotate(array, 6);

        assertEquals(0, SearchRotated.binarySearchRotated(array, 176));
    }

    @Test
    public void testCase7() {
        array = rotate(array, 6);

        assertEquals(19, SearchRotated.binarySearchRotated(array, 162));
    }

    @Test
    public void testCase8() {
        assertEquals(11, SearchRotated.binarySearchRotated(array, 133));
    }

    @Test
    public void testCase9() {
        assertEquals(0, SearchRotated.binarySearchRotated(array, 1));
    }

    @Test
    public void testCase10() {
        assertEquals(19, SearchRotated.binarySearchRotated(array, 222));
    }

    @Test
    public void testCase11() {
        int[] v1 = {6, 7, 1, 2, 3, 4, 5};

        assertEquals(4, SearchRotated.binarySearchRotated(v1, 3));
        assertEquals(0, SearchRotated.binarySearchRotated(v1, 6));
    }

    @Test
    public void testCase12() {
        int[] v1 = {4, 5, 6, 1, 2, 3};

        assertEquals(5, SearchRotated.binarySearchRotated(v1, 3));
        assertEquals(2, SearchRotated.binarySearchRotated(v1, 6));
    }
}
