package algorithmics.findindex;

import java.util.List;

public class FindLowHigh {
    public static int findLowIndex(List<Integer> arr, int key) {
        if (arr == null) {
            return -1;
        }

        int low = 0;
        int high = arr.size() - 1;
        int mid = high / 2;

        while (low <= high) {
            int midElem = arr.get(mid);
            if (midElem < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

            mid = (low + high) / 2;
        }

        if (low < arr.size() && arr.get(low) == key) {
            return low;
        }

        return -1;
    }

    public static int findHighIndex(List<Integer> arr, int key) {
        if (arr == null) {
            return -1;
        }

        int low = 0;
        int high = arr.size() - 1;
        int mid = high / 2;

        while (low <= high) {
            int midElem = arr.get(mid);
            if (midElem <= key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

            mid = (low + high) / 2;

        }

        if (high == -1) {
            return high;
        }

        if (high < arr.size() && arr.get(high) == key) {
            return high;
        }

        return -1;
    }

}
