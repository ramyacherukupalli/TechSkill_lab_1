package bitmaskdp;

public class Main {
    public static void main(String[] args) {

        int[][] cost = {
                {9, 2, 7},
                {6, 4, 3},
                {5, 8, 1}
        };

        OptimalAssignment solver = new OptimalAssignment();

        int result = solver.minCost(cost);

        System.out.println("Minimum assignment cost: " + result);
    }
}