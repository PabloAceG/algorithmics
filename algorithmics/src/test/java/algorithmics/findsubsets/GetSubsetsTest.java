package algorithmics.findsubsets;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GetSubsetsTest {
    private List<Integer> v;
    private List<HashSet<Integer>> sets;

    @BeforeEach
    public void init() {
        v = new ArrayList<Integer>();
        sets = new ArrayList<HashSet<Integer>>();
    }

    @Test
    public void testCase1() {
        GetSubsets.getAllSubsets(null, sets);

        assertTrue(sets.isEmpty());
    }

    @Test
    public void testCase2() {
        GetSubsets.getAllSubsets(v, sets);

        assertTrue(sets.isEmpty());
    }

    @Test
    public void testCase3() {
        v.add(2);
        v.add(3);
        v.add(4);

        List<HashSet<Integer>> expected = new ArrayList<HashSet<Integer>>();
        expected.add(new HashSet<>(Arrays.asList()));
        expected.add(new HashSet<>(Arrays.asList(2)));
        expected.add(new HashSet<>(Arrays.asList(3)));
        expected.add(new HashSet<>(Arrays.asList(2, 3)));
        expected.add(new HashSet<>(Arrays.asList(4)));
        expected.add(new HashSet<>(Arrays.asList(2, 4)));
        expected.add(new HashSet<>(Arrays.asList(3, 4)));
        expected.add(new HashSet<>(Arrays.asList(2, 3, 4)));

        GetSubsets.getAllSubsets(v, sets);

        assertEquals(sets, expected);
    }

    @Test
    public void testCase4() {
        v.add(2);
        v.add(3);
        v.add(4);

        List<HashSet<Integer>> expected = new ArrayList<HashSet<Integer>>();
        expected.add(new HashSet<>(Arrays.asList(2)));
        expected.add(new HashSet<>(Arrays.asList(3)));
        expected.add(new HashSet<>(Arrays.asList(2, 3)));
        expected.add(new HashSet<>(Arrays.asList(4)));
        expected.add(new HashSet<>(Arrays.asList(2, 4)));
        expected.add(new HashSet<>(Arrays.asList(3, 4)));
        expected.add(new HashSet<>(Arrays.asList(2, 3, 4)));

        GetSubsets.getAllSubsets(v, sets);

        assertNotEquals(sets, expected);
    }

    @Test
    public void testCase5() {
        v.add(8);
        v.add(13);
        v.add(3);
        v.add(45);

        List<HashSet<Integer>> expected = new ArrayList<HashSet<Integer>>();
        expected.add(new HashSet<>(Arrays.asList()));
        expected.add(new HashSet<>(Arrays.asList(8)));
        expected.add(new HashSet<>(Arrays.asList(13)));
        expected.add(new HashSet<>(Arrays.asList(8, 13)));
        expected.add(new HashSet<>(Arrays.asList(3)));
        expected.add(new HashSet<>(Arrays.asList(3, 8)));
        expected.add(new HashSet<>(Arrays.asList(3, 13)));
        expected.add(new HashSet<>(Arrays.asList(3, 8, 13)));
        expected.add(new HashSet<>(Arrays.asList(45)));
        expected.add(new HashSet<>(Arrays.asList(8, 45)));
        expected.add(new HashSet<>(Arrays.asList(13, 45)));
        expected.add(new HashSet<>(Arrays.asList(8, 13, 45)));
        expected.add(new HashSet<>(Arrays.asList(3, 45)));
        expected.add(new HashSet<>(Arrays.asList(3, 8, 45)));
        expected.add(new HashSet<>(Arrays.asList(3, 13, 45)));
        expected.add(new HashSet<>(Arrays.asList(3, 8, 13, 45)));

        GetSubsets.getAllSubsets(v, sets);

        assertEquals(sets, expected);
    }
}
