package algorithmics.stringsegmentation;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
*
* Tests for StringSegmentation.
*
* @author: <a href="mailto:p.aceredag@gmail.com">Pablo Acereda</a>
* @version: 1.0
* @license: Copyright 2021 Pablo Acereda
* License under AGPL v3, Version 2.0
*
*/
public class StringSegmentationTest {
    private Set<String> dictionary;

    @BeforeEach
    public void init() {
        dictionary = new HashSet<String>();

        dictionary.add("hello");
        dictionary.add("hell");
        dictionary.add("on");
        dictionary.add("now");
    }


    @Test
    public void testCase1() {
        String s = null;

        assertTrue(StringSegmentation.canSegmentString(s, dictionary));
    }

    @Test
    public void testCase2() {
        String s = null;

        assertTrue(StringSegmentation.canSegmentString(s, dictionary));
    }

    @Test
    public void testCase3() {
        String s = "hellonow";

        assertTrue(StringSegmentation.canSegmentString(s, dictionary));
    }

    @Test
    public void testCase4() {
        String s = "ellonow";

        assertFalse(StringSegmentation.canSegmentString(s, dictionary));
    }

    @Test
    public void testCase5() {
        Set<String> dictionary = new HashSet<String>();
        String s = "helloworld";
        assertFalse(StringSegmentation.canSegmentString(s, dictionary));
    }
}
