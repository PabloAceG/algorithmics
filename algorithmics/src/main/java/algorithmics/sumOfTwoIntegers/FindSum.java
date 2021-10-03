package algorithmics.sumOfTwoIntegers;

import java.util.Set;
import java.util.HashSet;

public class FindSum {
    public static boolean findSumOfTwo(int[] A, int val) {
        Set<Integer> consulted = new HashSet<Integer>();
        for (int i : A) {
            if (consulted.contains(val - i)) {
                return true;
            }

            consulted.add(i);
        }

        return false;
    }
}
