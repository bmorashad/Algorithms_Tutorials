import java.util.ArrayList;

public class AdjacencyList {

    // Add Edge
    public static void addEdge(ArrayList<ArrayList <Integer>> am, int s, int d){
        am.get(s).add(d);

        // Add the below line as well if its an undirected graph
        // am.get(d).add(s);
    }

    public static void main(String[] args) {
        // Create the graph
        int V = 8;
        ArrayList<ArrayList<Integer>> am = new ArrayList<>(V);

        for(int i = 0; i < V; i++){
            am.add(new ArrayList<>());
        }

        // Add Edges
        addEdge(am, 1, 2);
        addEdge(am, 1, 3);
        addEdge(am, 1, 4);
        addEdge(am, 2, 5);
        addEdge(am, 3, 1);
        addEdge(am, 3, 6);
        addEdge(am, 3, 5);
        addEdge(am, 4, 6);
        addEdge(am, 5, 7);
        addEdge(am, 6, 5);
        addEdge(am, 6, 7);

        printGraph(am);

    }

    // Print the graph
    private static void printGraph(ArrayList<ArrayList<Integer>> am) {
        for (int i = 0; i < am.size(); i++) {
            System.out.println("\nVertex " + i + ":");
            for (int j = 0; j < am.get(i).size(); j++) {
                System.out.print(" -> " + am.get(i).get(j));
            }
            System.out.println();
        }
    }

}

// https://www.cs.usfca.edu/~galles/visualization/DFS.html
// https://www.cs.usfca.edu/~galles/visualization/BFS.html