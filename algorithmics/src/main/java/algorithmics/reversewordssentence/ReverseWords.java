package algorithmics.reversewordssentence;

public class ReverseWords {

    private static void strRev(char[] str, int start, int end) {
        if (str == null || str.length < 2) {
            return;
        }

        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;

            start++;
            end--;
        }
    }

    public static char[] reverseWords(char[] sentence) {
        if (sentence == null || sentence.length == 0) {
            return sentence;
        }

        int len = sentence.length;

        // Reverse sentence. That means that also the words have been turned
        // around: Hello World = dlroW olleH
        //
        strRev(sentence, 0, len - 1);

        // Turn words backards, so that they face the right direction:
        // dlroW olleH = World Hello
        int start = 0;
        int end;
        while(true) {
            // Find first character of word
            while (start < len - 1 && sentence[start] == ' ') {
                start++;
            }

            if (start >= len - 1) break;

            // Find last character of word
            end = start + 1;
            while (end < len - 1 && sentence[end] != ' ') {
                end++;
            }


            if (end >= len - 1) end++;

            // Reverse word
            strRev(sentence, start, end - 1);

            start = end;
        }

        return sentence;
    }
}
