package algorithmics.balancedbracecombinations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class AllBracesTest {
    @Test
    public void testCase1() {
        ArrayList<ArrayList<Character>> result = AllBraces.printAllBraces(0);

        assertTrue(result.isEmpty());
    }

	@Test
    public void testCase2() {
        ArrayList<ArrayList<Character>> expected = new ArrayList<ArrayList<Character>>();
        expected.add(new ArrayList<Character>(Arrays.asList('{', '{', '{', '}', '}', '}')));
        expected.add(new ArrayList<Character>(Arrays.asList('{', '{', '}', '{', '}', '}')));
        expected.add(new ArrayList<Character>(Arrays.asList('{', '{', '}', '}', '{', '}')));
        expected.add(new ArrayList<Character>(Arrays.asList('{', '}', '{', '{', '}', '}')));
        expected.add(new ArrayList<Character>(Arrays.asList('{', '}', '{', '}', '{', '}')));

        ArrayList<ArrayList<Character>> result = AllBraces.printAllBraces(3);

        assertEquals(expected, result);
    }

	@Test
    public void testCase3() {
        ArrayList<ArrayList<Character>> expected = new ArrayList<ArrayList<Character>>();
        expected.add(new ArrayList<Character>(Arrays.asList('{', '{', '{', '}', '}', '}')));
        expected.add(new ArrayList<Character>(Arrays.asList('{', '{', '}', '}', '{', '}')));
        expected.add(new ArrayList<Character>(Arrays.asList('{', '{', '}', '{', '}', '}')));
        expected.add(new ArrayList<Character>(Arrays.asList('{', '}', '{', '{', '}', '}')));
        expected.add(new ArrayList<Character>(Arrays.asList('{', '}', '{', '}', '{', '}')));

        ArrayList<ArrayList<Character>> result = AllBraces.printAllBraces(3);

        assertNotEquals(expected, result);
    }
}
