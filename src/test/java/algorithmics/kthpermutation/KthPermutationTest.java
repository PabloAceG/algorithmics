package algorithmics.kthpermutation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
*
* Tests for CoinChaning.
*
* @author: <a href="mailto:p.aceredag@gmail.com">Pablo Acereda</a>
* @version: 1.0
* @license: Copyright 2021 Pablo Acereda
* License under AGPL v3, Version 2.0
*
*/
public class KthPermutationTest {
    private List<Character> v;
    private StringBuilder result;

    @BeforeEach
    public void init() {
        v = new ArrayList<Character>();
        char c = '1';
        for (int i = 0; i < 4; i++) {
            v.add(c);
            c++;
        }

        result = new StringBuilder();
    }

    @Test
    public void testCase1() {
        KthPermutation.findKthPermutation(null, 0, result);

        assertTrue(result.isEmpty());
    }

    @Test
    public void testCase2() {
        List<Character> vEmpty = new ArrayList<Character>();
        KthPermutation.findKthPermutation(vEmpty, 0, result);

        assertTrue(result.isEmpty());
    }

    @Test
    public void testCase3() {
        KthPermutation.findKthPermutation(v, 1, result);
        String permutation = "1234";

        assertEquals(result.toString(), permutation);
    }

    @Test
    public void testCase4() {
        KthPermutation.findKthPermutation(v, 10, result);
        String permutation = "2341";

        assertEquals(result.toString(), permutation);
    }

    @Test
    public void testCase5() {
        KthPermutation.findKthPermutation(v, 100, result);

        assertTrue(result.isEmpty());
    }
}
