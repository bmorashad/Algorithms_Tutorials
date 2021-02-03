
public class ThreeSum {

    /**
     * Prints to standard output the (i, j, k) with i < j < k such that a[i] + a[j] + a[k] == 0.
     * @param a the array of integers
     */

    public static void printAll(int[] a) {
        int N = a.length;

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        // printing out the result of the 3-sum algo
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                    }
                }
            }
        }

    } 

    /**
     * Returns the number of triples (i, j, k) with i < j < k such that a[i] + a[j] + a[k] == 0.
     * @param a the array of integers
     * @return the number of triples (i, j, k) with i < j < k such that a[i] + a[j] + a[k] == 0
     */
    
    public static int count(int[] a) {
        
    	int N = a.length;
        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        // counting the number of 3 sum made
                        count++;
                    }
                }
            }
        }

	    // Complete the method implementation...
        return count;


    } 

    /**
     * Reads in a sequence of integers from a file, specified as a command-line argument;
     * counts the number of triples sum to exactly zero; prints out the time to perform
     * the computation.
     */
    
    public static void main(String[] args)  { 
		
        In in = new In("8Kints.txt");
        int[] a = in.readAllInts();

        for (int i = 0; i < 5; i++) {
            Stopwatch timer = new Stopwatch();
            int cnt = count(a);
            StdOut.println("elapsed time = " + timer.elapsedTime());
            StdOut.println(cnt);

        }
//        printAll(a);

    } 
}    
