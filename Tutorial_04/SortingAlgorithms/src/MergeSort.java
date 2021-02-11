public class MergeSort {

    public static void main(String[] args) {

        // Array to be sorted
        int[] arr = { 12, 11, 13, 5, 6, 7 };

        // Before sorting arr
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // calling the bubbleSort method to sort the above array
        mergeSort(arr, 0, arr.length-1);

        // After sorting arr
        System.out.println();
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // mergeSort method
    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right-left)/2;

            // Sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {

        // Find sizes of two sub arrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        /* Create temp arrays */
        int Left[] = new int[n1];
        int Right[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            Left[i] = arr[left + i];

        for (int j = 0; j < n2; ++j)
            Right[j] = arr[mid + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0;
        int j = 0;

        // Initial index of merged subarry array
        int k = left;
        while (i < n1 && j < n2) {
            if (Left[i] <= Right[j]) {
                arr[k] = Left[i];
                i++;
            }
            else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = Left[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = Right[j];
            j++;
            k++;
        }

    }

}

// MERGE SORT
//  Merge Sort is a Divide and Conquer algorithm.
//  It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves.\
//  The merge() function is used for merging two halves.


//    MergeSort(arr[], l,  r)

//    If r > l
//        1. Find the middle point to divide the array into two halves:
//        middle m = l+ (r-l)/2

//        2. Call mergeSort for first half:
//        Call mergeSort(arr, l, m)

//        3. Call mergeSort for second half:
//        Call mergeSort(arr, m+1, r)

//        4. Merge the two halves sorted in step 2 and 3:
//        Call merge(arr, l, m, r)