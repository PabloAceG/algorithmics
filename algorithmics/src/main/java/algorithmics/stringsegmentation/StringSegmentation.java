package algorithmics.stringsegmentation;

import java.util.Set;

public class StringSegmentation {
    public static boolean canSegmentString(
        String s,
        Set<String> dictionary) {

        for (int i = 1; i < s.length(); i++) {
            String firstWord = s.substring(0, i);

            if (dictionary.contains(firstWord)) {
                String secondWord = s.substring(i);

                if (secondWord == null ||
                    secondWord.length() == 0 ||
                    dictionary.contains(secondWord) ||
                    canSegmentString(secondWord, dictionary)) {
                    return true;
                }
            }
        }

        return false;
    }
}
