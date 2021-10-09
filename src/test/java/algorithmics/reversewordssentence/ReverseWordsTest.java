package algorithmics.reversewordssentence;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

/**
*
* Tests for ReverseWords.
*
* @author: <a href="mailto:p.aceredag@gmail.com">Pablo Acereda</a>
* @version: 1.0
* @license: Copyright 2021 Pablo Acereda
* License under AGPL v3, Version 2.0
*
*/
public class ReverseWordsTest {

    private char[] toCharArray(String s) {
        return s.toCharArray();
    }

    @Test
    public void testCase1() {
        char[] sentence = ReverseWords.reverseWords(null);
        char[] revSentence = null;

        assertArrayEquals(sentence, revSentence);
    }

    @Test
    public void testCase2() {
        char[] sentence = ReverseWords.reverseWords(toCharArray(""));
        char[] revSentence = toCharArray("");

        assertArrayEquals(sentence, revSentence);
    }

    @Test
    public void testCase3() {
        char[] sentence = ReverseWords.reverseWords(toCharArray("Hello World"));
        char[] revSentence = toCharArray("World Hello");

        assertArrayEquals(sentence, revSentence);
    }

    @Test
    public void testCase4() {
        char[] sentence = ReverseWords.reverseWords(toCharArray("Hello World"));
        char[] revSentence = toCharArray("dlroW olleH");

        assertFalse(Arrays.equals(sentence, revSentence));
    }

    @Test
    public void testCase5() {
        char[] sentence = ReverseWords.reverseWords(toCharArray("Hello World"));
        char[] revSentence = toCharArray("World olleH");

        assertFalse(Arrays.equals(sentence, revSentence));
    }
}
