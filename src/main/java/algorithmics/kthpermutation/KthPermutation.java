package algorithmics.kthpermutation;

import java.util.List;

public class KthPermutation {
    private static int factorial(int n) {
        if (n <= 0) return 1;
        return n * factorial(n - 1);
    }

    public static void findKthPermutation(
        List<Character> v,
        int k,
        StringBuilder result) {

        if (v == null || v.isEmpty() || k == 0) return;

        int n = v.size();
        int numPermutations = factorial(n - 1);
        int selected = (k - 1) / numPermutations;

        if (selected > n) return;
        result.append(v.get(selected));
        v.remove(selected);

        k = k - (numPermutations * selected);
        findKthPermutation(v, k, result);
    }
}
