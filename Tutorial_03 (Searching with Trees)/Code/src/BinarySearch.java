/**
 * ***************************************************************************
 * <p>
 * % java BinarySearch tinyW.txt  tinyT.txt
 * 50
 * 99
 * 13
 * <p>
 * % java BinarySearch largeW.txt  largeT.txt
 * 499569
 * 984875
 * 295754
 * 207807
 * 140925
 * 161828
 * [367,966 total values]
 * <p>
 * ****************************************************************************
 */

import java.util.Arrays;

public class BinarySearch {

    private BinarySearch() {
    }

    public static int indexOf(int[] a, int key) {

        Arrays.sort(a);

        int first = 0;
        int last = a.length - 1;

        // Getting the middle index position from the array
        int mid = (first + last) / 2;

        while (first <= last) {

            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }

            // getting the new mid point
            mid = (first + last) / 2;
        }


        return -1;
    }


    public static int rank(int key, int[] a) {
        return indexOf(a, key);
    }


    public static void main(String[] args) {

        // read the integers from a file 
        // set up the initial database.
        In in = new In("D:/IIT/2nd Year/Alogrithm/Tutorials/Tutorial_03/largeW.txt");
        int[] whitelist = in.readAllInts();

        // sort the array
        Arrays.sort(whitelist);

        // read search data from input file
        In searchItems = new In("D:/IIT/2nd Year/Alogrithm/Tutorials/Tutorial_03/largeT.txt");

        System.out.println("Starting search for missing values...please wait...");

        Stopwatch timer = new Stopwatch();
        while (!searchItems.isEmpty()) {
            int key = searchItems.readInt();
            if (BinarySearch.indexOf(whitelist, key) == -1) {
                StdOut.println(key);
            }
        }

        // Take the time for search...
        System.out.println("Time elapsed: " + timer.elapsedTime());
    }
}


//  tinyW.txt  tinyT.txt
//    50
//    99
//    13
//    Time elapsed: 0.004

//  largeW.txt  largeT.txt
// taking too long