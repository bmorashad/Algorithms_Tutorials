import java.io.*;
import java.util.Scanner;

public class QuickFindUF {
    private int[] id;
    private int count;

    public QuickFindUF(int N) {
        count = 0;
        id = new int[N];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }

        // we create an array with N elements from 0 to N
        // Assuming N = 10
        // eg:- [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }

    public int count() {
        return ++count;
    }

    public int find(int p) {
        return 0;

    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        count();

        int P = id[p];
        int Q = id[q];

        for (int i = 0; i < id.length; i++) {
            if(id[i] == P){
                id[i] = Q;
            }
        }

    }

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
        QuickFindUF uf = new QuickFindUF(N);

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

        System.out.println(uf.count + " components");
    }

}



