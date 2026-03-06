package bitmaskdp;

public class OptimalAssignment {

    public int minCost(int[][] cost) {

        int n = cost.length;
        int totalMasks = 1 << n;

        int[] dp = new int[totalMasks];

        for (int i = 0; i < totalMasks; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        dp[0] = 0;

        for (int mask = 0; mask < totalMasks; mask++) {

            int worker = Integer.bitCount(mask);

            if (worker >= n) continue;

            for (int task = 0; task < n; task++) {

                if ((mask & (1 << task)) == 0) {

                    int newMask = mask | (1 << task);

                    dp[newMask] = Math.min(
                            dp[newMask],
                            dp[mask] + cost[worker][task]
                    );
                }
            }
        }

        return dp[totalMasks - 1];
    }
}