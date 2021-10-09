package algorithmics.balancedbracecombinations;

import java.util.ArrayList;

public class AllBraces {
    public static void printAllBracesRec(
        int n,
        int leftBraces,
        int rightBraces,
        ArrayList<Character> output,
        ArrayList<ArrayList<Character>> result) {

        if (leftBraces >= n && rightBraces >= n) {
            result.add((ArrayList) output.clone());
        }

        if (leftBraces < n) {
            output.add('{');
            printAllBracesRec(n, leftBraces + 1, rightBraces, output, result);
            output.remove(output.size() - 1);
        }

        if (rightBraces < leftBraces) {
            output.add('}');
            printAllBracesRec(n, leftBraces, rightBraces + 1, output, result);
            output.remove(output.size() - 1);
        }
    }

    public static ArrayList<ArrayList<Character>> printAllBraces(int n) {
        ArrayList<Character> output = new ArrayList<Character>();
        ArrayList<ArrayList<Character>> result = new ArrayList<ArrayList<Character>>();

        if (n == 0) {
            return result;
        }

        printAllBracesRec(n, 0, 0, output, result);

        return result;
    }
}
