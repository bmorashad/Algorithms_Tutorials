public class Question02 {
    private static int[] b;

    public static void main(String[] args) {
        // this is the input array
        int[] input = {38, 27, 43, 82, 3, 9, 10};

        // performing the sorting
        sort(input);

        // displaying the sorted items
        for (int x : b) {
            System.out.print(x + " ");
        }
    }

    public static void sort(int[] a) {
        b = new int[a.length];
        naturalMergeSort(a);
    }

    private static void naturalMergeSort(int[] a) {
        int left = 0;
        int right = a.length - 1;
        boolean sorted = false;
        int l = 0;
        int r = right;

        do {
            sorted = true;
            left = 0;

            while (left < right) {
                l = left;
                while (l < right && a[l] <= a[l + 1]) {
                    l++;
                }
                r = l + 1;
                while (r == right - 1 || r < right && a[r] <= a[r + 1]) {
                    r++;
                }
                if (r <= right) {
                    merge(a, left, l, r);
                    sorted = false;
                }
                left = r + 1;
            }
        } while (!sorted);
    }

    private static void merge(int[] a, int left, int middle, int right) {
        int l = left;
        int r = middle + 1;

        for (int i = left; i <= right; i++) {
            if (r > right || (l <= middle && a[l] <= a[r])) {
                b[i] = a[l++];
            } else if (l > middle || (r <= right && a[r] <= a[l])) {
                b[i] = a[r++];
            }
        }

        for (int i = left; i <= right; i++) {
            a[i] = b[i];
        }
    }
}

// In this question we are going to apply "Natural Merge Sort" Algorithm
// we have to sort this Input Array: {38, 27, 43, 82, 3, 9, 10}

/*
 *
 * Natural mergesort is a improved version of bottom-up mergesort.
 * It finds and merges pairs of subsequence that are already ordered.
 *
 * The best case for natural merge sort is a sorted array, the running time is O(n).
 * The worst case still is O(n log n).
 *
 */