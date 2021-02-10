import java.util.*;

public class SearchSA {

    /**
     * This class should not be instantiated.
     */
    private SearchSA() {
    }

    /**
     * Returns the index of the specified key in the specified array.
     *
     * @param arr the array of integers
     * @param key the search key
     * @return index of key in array <tt>a</tt> if present; <tt>-1</tt>
     * otherwise
     */
    public static int indexOf(int[] arr, int key) {
        // Complete the missing implementation for this method....
        System.out.println("Input Count: " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    public static int rank(int key, int[] a) {
        return indexOf(a, key);
    }

    public static void main(String[] args) {

        // Read the integers from a file set up the initial database.
        In in = new In("D:/IIT/2nd Year/Alogrithm/Tutorials/Tutorial_03/largeW.txt");
        int[] whitelist = in.readAllInts();


        // read search data from input file
        In searchItems = new In("D:/IIT/2nd Year/Alogrithm/Tutorials/Tutorial_03/tinyT.txt");

        System.out.println("Starting search for missing values...please wait...");

        Stopwatch timer = new Stopwatch();
        while (!searchItems.isEmpty()) {
            int key = searchItems.readInt();
            if (SearchSA.indexOf(whitelist, key) == -1) {
                StdOut.println(key);
            }
        }

        // Take the time for search...
        System.out.println("Time elapsed: " + timer.elapsedTime());

    }
}


//  Input File        Input Count     T(N) Time
// - tinyW.txt             15           0.004
// - largeW.txt         1000000         0.020