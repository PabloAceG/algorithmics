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
class FindSumTest {
    @Test
    void testCase1() {
        int[] A = new int[] {5, 7, 1, 2, 8, 4, 3};
        int val = 3;

        assertTrue(FindSum.findSumOfTwo(A, val));
    }

    @Test
    void testCase2() {
        int[] A = new int[] {5, 7, 1, 2, 8, 4, 3};
        int val = 20;

        assertFalse(FindSum.findSumOfTwo(A, val));
    }

    @Test
    void testCase3() {
        int[] A = new int[] {5, 7, 1, 2, 8, 4, 3};
        int val = 1;

        assertFalse(FindSum.findSumOfTwo(A, val));
    }

    @Test
    void testCase4() {
        int[] A = new int[] {5, 7, 1, 2, 8, 4, 3};
        int val = 2;

        assertFalse(FindSum.findSumOfTwo(A, val));
    }

    @Test
    void testCase5() {
        int[] A = new int[] {5, 7, 1, 2, 8, 4, 3};
        int val = 7;

        assertTrue(FindSum.findSumOfTwo(A, val));
    }
}
