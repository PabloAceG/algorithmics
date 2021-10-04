package algorithmics.stringsegmentation;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.HashSet;
import java.util.Set;

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
    @Test
    public void testCase1() {
        Set<String> dictionary = new HashSet<String>();
        String s = null;

        dictionary.add("hello");
        dictionary.add("hell");
        dictionary.add("on");
        dictionary.add("now");

        assertTrue(StringSegmentation.canSegmentString(s, dictionary));
    }

    @Test
    public void testCase2() {
        Set<String> dictionary = new HashSet<String>();
        String s = null;

        dictionary.add("hello");
        dictionary.add("hell");
        dictionary.add("on");
        dictionary.add("now");

        assertTrue(StringSegmentation.canSegmentString(s, dictionary));
    }

    @Test
    public void testCase3() {
        Set<String> dictionary = new HashSet<String>();
        String s = "hellonow";

        dictionary.add("hello");
        dictionary.add("hell");
        dictionary.add("on");
        dictionary.add("now");

        assertTrue(StringSegmentation.canSegmentString(s, dictionary));
    }

    @Test
    public void testCase4() {
        Set<String> dictionary = new HashSet<String>();
        String s = "ellonow";

        dictionary.add("hello");
        dictionary.add("hell");
        dictionary.add("on");
        dictionary.add("now");

        assertFalse(StringSegmentation.canSegmentString(s, dictionary));
    }

    @Test
    public void testCase5() {
        Set<String> dictionary = new HashSet<String>();
        String s = "helloworld";

        dictionary.add("hello");
        dictionary.add("hell");
        dictionary.add("on");
        dictionary.add("now");

        assertFalse(StringSegmentation.canSegmentString(s, dictionary));
    }
}
