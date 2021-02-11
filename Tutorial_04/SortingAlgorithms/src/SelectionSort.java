public class SelectionSort {
    public static void main(String[] args) {

        // Array to be sorted
        int[] arr = {64,25,12,22,11};

        // Before sorting arr
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // calling the selectionSort method to sort the above array
        selectionSort(arr);

        // After sorting arr
        System.out.println();
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    // sorting method
    private static void selectionSort(int[] arr) {

        int totalArrLength = arr.length;  // length of the array

        for (int i = 0; i < totalArrLength; i++) {
            int min_index = i;  // Find the minimum element from the unsorted array

            for (int j = i+1; j < totalArrLength; j++) {
                if(arr[j] < arr[min_index]){
                    min_index = j; // found the new min value INDEX
                }
            }

            // Swapping the min element with the first element
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;

        }

    }

}

// SELECTION SORT
// The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order)
// from unsorted part and putting it at the beginning. (you can also use the maximum element at the end to sort this)

// The algorithm maintains two sub arrays in a given array.
//  1) The subarray which is already sorted.
//  2) Remaining subarray which is unsorted.