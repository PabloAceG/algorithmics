package algorithmics.stringsegmentation;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;

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
    public void tesCase1() {
        Set<String> dictionary = new HashSet<String>();
        String s = "hellonow";

        dictionary.add("hello");
        dictionary.add("hell");
        dictionary.add("on");
        dictionary.add("now");

        assertTrue(StringSegmentation.canSegmentString(s, dictionary));
    }


    @Test
    public void tesCase2() {
        Set<String> dictionary = new HashSet<String>();
        String s = "helloworld";

        dictionary.add("hello");
        dictionary.add("hell");
        dictionary.add("on");
        dictionary.add("now");

        assertFalse(StringSegmentation.canSegmentString(s, dictionary));
    }
}
