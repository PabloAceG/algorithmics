package algorithmics.sumOfTwoIntegers;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

/**
*
* Tests for FindSum.
*
* @author: <a href="mailto:p.aceredag@gmail.com">Pablo Acereda</a>
* @version: 1.0
* @license: Copyright 2021 Pablo Acereda
* License under AGPL v3, Version 2.0
*
*/
public class FindSumTest {
    @Test
    public void testCase1() {
        int[] A = new int[] {5, 7, 1, 2, 8, 4, 3};
        int val = 3;

        assertTrue(FindSum.findSumOfTwo(A, val));
    }

    @Test
    public void testCase2() {
        int[] A = new int[] {5, 7, 1, 2, 8, 4, 3};
        int val = 20;

        assertFalse(FindSum.findSumOfTwo(A, val));
    }

    @Test
    public void testCase3() {
        int[] A = new int[] {5, 7, 1, 2, 8, 4, 3};
        int val = 1;

        assertFalse(FindSum.findSumOfTwo(A, val));
    }

    @Test
    public void testCase4() {
        int[] A = new int[] {5, 7, 1, 2, 8, 4, 3};
        int val = 2;

        assertFalse(FindSum.findSumOfTwo(A, val));
    }

    @Test
    public void testCase5() {
        int[] A = new int[] {5, 7, 1, 2, 8, 4, 3};
        int val = 7;

        assertTrue(FindSum.findSumOfTwo(A, val));
    }
}
