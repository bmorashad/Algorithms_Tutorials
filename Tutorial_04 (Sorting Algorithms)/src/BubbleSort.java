public class BubbleSort {
    public static void main(String[] args) {

        // Array to be sorted
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        // Before sorting arr
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // calling the bubbleSort method to sort the above array
        bubbleSort(arr);

        // After sorting arr
        System.out.println();
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    // sorting method
    private static void bubbleSort(int[] arr) {

        int numberOfLoops = arr.length - 1;  // length of the array

        for (int i = 0; i < numberOfLoops; i++) {   // Outer Loop
            for (int j = 0; j < numberOfLoops - i; j++) {   // Inner Loop
                if(arr[j] > arr[j+1]){  // Swapping the elements

                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
}


// BUBBLE SORT
// Bubble sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in
// wrong order.


