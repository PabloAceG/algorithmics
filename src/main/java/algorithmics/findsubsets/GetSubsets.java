package algorithmics.findsubsets;

import java.util.HashSet;
import java.util.List;

public class GetSubsets {
    /**
     * Every time a number is shifted it is multipled by two until it
     * overflows, in which case it is diviced by 2 until it reaches 0
     * This being the case, it is used to see if the element corresponds
     * to one of the permutations by seeing if the shifting does not
     * overflow the integer and see if it corresponds to the permutation
     * being analized. If that is the case, it can be added to the
     * permutations
     *
     * @param n Permutation number (from the total number of permutations).
     * @param shift Element being analized.
     *
     * @return Element being part of the permutation or not.
     *
     */
    private static boolean shouldGetBit(int n, int shift) {
        int temp = 1 << shift;
        temp = n & temp;
        if (temp == 0) {
            return false;
        }

        return true;
    }
    public static void getAllSubsets(List<Integer> v, List<HashSet<Integer>> sets) {
        if (v == null || v.isEmpty() || sets == null)
            return;

        // Number of sets = 2^n -> where n is the number of elements
        int numSets = (int) Math.pow(2, v.size());

        for (int i = 0; i < numSets; i++) {
            // Iterate through each element and see if bit representation says
            // to add element
            HashSet<Integer> set = new HashSet<Integer>();
            for (int j = 0; j < v.size(); j++) {
                if (shouldGetBit(i, j)) {
                    set.add(v.get(j));
                }
            }

            sets.add(set);
        }
    }
}
