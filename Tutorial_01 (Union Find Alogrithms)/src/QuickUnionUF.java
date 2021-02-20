import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuickUnionUF {
    // Variables
    private int[] id;
    private int count;

    // Constructor
    public QuickUnionUF(int totalNumberOfNodes) {

        count = totalNumberOfNodes;
        id = new int[totalNumberOfNodes];

        for (int i = 0; i < id.length; i++) {
            // Initializing the array (depends on the given totalNumberOfNodes)
            // like this  eg:- [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
            id[i] = i;
        }

    }

    // Method which returns the number of components or sets
    public int count() {
        return count;
    }

    // Returns the element of the set containing element
    // chase parent pointer until reach root (depth of i array accesses)
    public int find(int p) {
        while (p != id[p]) {
            // This is how u get the root when the index is equal to the value of at the index means that it is a root
            p = id[p];
        }
        return p;
    }

    // Check whether p and q are in the same component (2 array accesses)
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    // change root of p to point to root of q (depth of p and q array accesses)
    public void union(int p, int q) {

        // getting the roots of the element
        int rootP = find(p);
        int rootQ = find(q);

        // Since same root
        if(rootP == rootQ){
            return;
        }

        // Changing the root
        id[rootP] = rootQ;

    }

    // main method
    public static void main(String[] args) {

        Scanner input = null;
        String inputFilePath = "D:\\IIT\\2nd Year\\Alogrithm\\Tutorials\\Tutorial_01 (Union Find Alogrithms)\\src\\tinyUF.txt";

        try {
            input = new Scanner(new File(inputFilePath));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        int totalNumberOfNodes = input.nextInt();

        System.out.println("Number of nodes is: " + totalNumberOfNodes);
        QuickUnionUF quickUnionUF = new QuickUnionUF(totalNumberOfNodes);

        while (input.hasNextInt()) {

            int p = input.nextInt();
            int q = input.nextInt();

            if (quickUnionUF.connected(p, q)) {
                System.out.println(p + " and " + q + " are already connected!");
                continue;
            }

            quickUnionUF.union(p, q);

            System.out.println(p + " and " + q + " formed union!");

        }

        System.out.println(quickUnionUF.count() + " components");
    }

}

// https://algs4.cs.princeton.edu/15uf/QuickUnionUF.java.html