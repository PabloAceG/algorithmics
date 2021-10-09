package algorithmics.searchrotatedarray;

public class SearchRotated {
    private static int binarySearch(int[] arr, int start, int end, int key) {
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (arr[mid] == key) {
            return mid;
        }

        if (arr[start] <= arr[mid] && key <= arr[mid] && key >= arr[start]) {
            return binarySearch(arr, start, mid - 1, key);
        } else if (arr[mid] <= arr[end] && key >= arr[mid] && key <= arr[end]) {
            return binarySearch(arr, mid + 1, end, key);
        } else if (arr[end] <= arr[mid]) {
            return binarySearch(arr, mid + 1, end, key);
        } else if (arr[start] >= arr[mid]) {
            return binarySearch(arr, start, mid - 1, key);
        }

        return -1;
    }

    public static int binarySearchRotated(int[] arr, int key) {
        return binarySearch(arr, 0, arr.length - 1, key);
    }
}
