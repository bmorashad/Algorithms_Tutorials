import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuickUnionUF {
    private int[] id;
    private int count;

    public QuickUnionUF(int N) {
        count = 0;
        id = new int[N];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }

        // we create an array with N elements from 0 to N
        // Assuming N = 10
        // eg:- [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }

    // chase parent pointer until reach root (depth of i array accesses)
    public  int root(int i){
        while (i != id[i]){
            i = id[i];
        }
        return i;
    }

    // check if p and q have same root (depth of p and q array accesses)
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    // change root of p to point to root of q (depth of p and q array accesses)
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;

    }

    // main method
    public static void main(String[] args) {

        Scanner input = null;
        try {
            input = new Scanner(new File("D:\\IIT\\2nd Year\\Alogrithm\\Tutorials\\Tutorial_01 (Union Find Alogrithms)\\src\\tinyUF.txt"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        int N = input.nextInt();

        System.out.println("Number of nodes is: " + N);
        QuickUnionUF uf = new QuickUnionUF(N);

        // while (!StdIn.isEmpty()) {   <- ENABLE ONLY if reading from console or terminal
        while (input.hasNextInt()) { // ONLY for IDE version, remove otherwise

            // int p = StdIn.readInt(); <- ENABLE ONLY if reading from console or terminal
            int p = input.nextInt(); // ONLY for IDE version, remove otherwise

            // int q = StdIn.readInt(); <- ENABLE ONLY if reading from console or terminal
            int q = input.nextInt(); // ONLY for IDE version, remove otherwise

            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            System.out.println(p + " " + q);

        }

    }
}