package graphs;

import java.util.*;

public class CriticalLinks {

    private int timer;
    private List<List<Integer>> bridges;

    public List<List<Integer>> findBridges(int n, List<List<Integer>> connections) {

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (List<Integer> edge : connections) {
            int u = edge.get(0);
            int v = edge.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        timer = 0;
        bridges = new ArrayList<>();

        int[] disc = new int[n];
        int[] low = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, -1, adj, visited, disc, low);
            }
        }

        return bridges;
    }

    private void dfs(int node, int parent,
                     List<List<Integer>> adj,
                     boolean[] visited,
                     int[] disc,
                     int[] low) {

        visited[node] = true;
        disc[node] = low[node] = timer++;

        for (int neighbor : adj.get(node)) {

            if (neighbor == parent) {
                continue;
            }

            if (!visited[neighbor]) {

                dfs(neighbor, node, adj, visited, disc, low);

                low[node] = Math.min(low[node], low[neighbor]);

                if (low[neighbor] > disc[node]) {
                    bridges.add(Arrays.asList(node, neighbor));
                }

            } else {
                low[node] = Math.min(low[node], disc[neighbor]);
            }
        }
    }
}