package algorithmics.findindex;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FindLowHighTest {
    private List<Integer> array;

    @BeforeEach
    public void init() {
        array = Arrays.asList(1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6);
    }

    @Test
    public void testCase1() {
        int low = FindLowHigh.findLowIndex(null, -1);
        int high = FindLowHigh.findHighIndex(null, -1);

        assertEquals(low, -1);
        assertEquals(high, -1);
    }

    @Test
    public void testCase2() {
        List<Integer> emptyList = new ArrayList<Integer>();

        int low = FindLowHigh.findLowIndex(emptyList, -1);
        int high = FindLowHigh.findHighIndex(emptyList, -1);

        assertEquals(low, -1);
        assertEquals(high, -1);
    }

    @Test
    public void testCase3() {
        int key = 5;
        int low = FindLowHigh.findLowIndex(array, key);
        int high = FindLowHigh.findHighIndex(array, key);

        assertEquals(low, 15);
        assertEquals(high, 17);
    }

    @Test
    public void testCase4() {
        int key = 6;
        int low = FindLowHigh.findLowIndex(array, key);
        int high = FindLowHigh.findHighIndex(array, key);

        assertEquals(low, 18);
        assertEquals(high, 23);
    }

    @Test
    public void testCase5() {
        int key = -2;
        int low = FindLowHigh.findLowIndex(array, key);
        int high = FindLowHigh.findHighIndex(array, key);

        assertEquals(low, -1);
        assertEquals(high, -1);
    }
}
