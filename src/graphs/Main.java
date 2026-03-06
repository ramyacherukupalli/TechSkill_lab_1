package graphs;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int n = 4;

        List<List<Integer>> connections = new ArrayList<>();
        connections.add(Arrays.asList(0, 1));
        connections.add(Arrays.asList(1, 2));
        connections.add(Arrays.asList(2, 0));
        connections.add(Arrays.asList(1, 3));

        CriticalLinks solver = new CriticalLinks();

        List<List<Integer>> bridges = solver.findBridges(n, connections);

        System.out.println(bridges);
    }
}