import java.io.*;
import java.util.Scanner;

public class QuickFindUF {

    // Variables
    private int[] id;
    private int count;

    // Constructor
    public QuickFindUF(int totalNumberOfNodes) {

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

    // Returns the element of the set containing element (the parameter 'p' is an index of the array)
    public int find(int p) {
        return id[p];
    }

    // Check whether p and q are in the same component (2 array accesses)
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {

        int pid = id[p];
        int qid = id[q];

        // p and q are already in the same component
        if(pid == qid){
            return;
        }

        // Change all entries with id[p] to id[q]
        for (int i = 0; i < id.length; i++) {
            if(id[i] == pid){
                id[i] = qid;
            }
        }

        // Once A union is formed we reduce the counter by 1
        count --;

    }

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
        QuickFindUF quickFindUF = new QuickFindUF(totalNumberOfNodes);

        while (input.hasNextInt()) {

            int p = input.nextInt();
            int q = input.nextInt();

            if (quickFindUF.connected(p, q)) {
                System.out.println(p + " and " + q + " are already connected!");
                continue;
            }

            quickFindUF.union(p, q);

            System.out.println(p + " and " + q + " formed union!");

        }

        System.out.println(quickFindUF.count() + " components");
    }

}


// https://algs4.cs.princeton.edu/15uf/QuickFindUF.java.html