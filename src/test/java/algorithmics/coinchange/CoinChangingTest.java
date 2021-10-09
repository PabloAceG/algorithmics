package algorithmics.coinchange;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
public class CoinChangingTest {
    @Test
    public void testCase1() {
        int[] denominations = {1, 2, 5};
        int amount = 7;
        int result = CoinChanging.solveCoinChange(denominations, amount);


        int expected = 6;
        assertEquals(result, expected);
    }

    @Test
    public void testCase2() {
        int[] denominations = {1, 2, 5};
        int amount = 7;
        int result = CoinChanging.solveCoinChange(denominations, amount);


        int expected = 5;
        assertNotEquals(result, expected);
    }

}
