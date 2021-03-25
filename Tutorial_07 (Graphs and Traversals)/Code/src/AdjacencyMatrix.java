import java.util.Arrays;

public class AdjacencyMatrix {

    public static void main(String[] args) {

        int vertices = 7;
        int[][] edges = {{1,2}, {1,3}, {1,4}, {2,5}, {3,1}, {3,5}, {3,6}, {4,6}, {5,7}, {6,3}, {6,5}, {6,7}};
        createAdjacencyMatrix(vertices, edges);

    }

    private static void createAdjacencyMatrix(int vertices, int[][] edges) {
        vertices += 1;
        int[][] adjacencyMatrix = new int[vertices][vertices];

        for (int[] edge : edges) {
            adjacencyMatrix[edge[0]][edge[1]] = 1;
        }

        for (int[] row : adjacencyMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }

}
