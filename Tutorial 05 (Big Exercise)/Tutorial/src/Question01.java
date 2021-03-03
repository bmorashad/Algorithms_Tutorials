import java.util.Arrays;

public class Question01 {

    public static void main(String[] args) {

        // input array
        int[] input = {4, 8, 2, 1, 15, 9, -5};

        // sorted input array
        Arrays.sort(input);

        // get the largest number from the array
        int result = largestNumberFromArray(input, 0, input.length - 1);
        if(result == -1){
            System.out.println("Invalid array input");
        }else{
            System.out.println("Largest number of the array is " + input[result]);
        }

    }

    private static int largestNumberFromArray(int[] arr, int left, int right) {
        if(right >= left){
            // we calculate the mid point
            int mid = left + (right - left)/2;

            // we check if the last index of the array is reached
            if(mid == arr.length - 1){
                return mid;
            }

            // we then move toward the right side of the array cuz we know that largest number lies there
            return largestNumberFromArray(arr,mid + 1, right);
        }
        return -1;
    }


}


// Question
// Design a binary search based algorithm to find the largest number in an array of N integers, a[0], a[1], a[N-1].
// To get the largest number from an array using binary search, we need to perform continuous left mid operation until
// we reach the last element.
