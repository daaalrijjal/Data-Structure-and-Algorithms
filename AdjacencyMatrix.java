import java.util.*;

public class AdjacencyMatrix {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n is vertices
        // m is edges
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] adjMat = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjMat[u][v] = 1;
            adjMat[v][u] = 1;
        }

        // Print the adjacency matrix
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
