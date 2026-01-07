class Solution {
    int[][] dp;

    public int maxProfit(int[] prices) {
        int n = prices.length;
        dp = new int[n][2];

        for (int i = 0; i < n; i++) {
            dp[i][0] = -1;
            dp[i][1] = -1;
        }

        return solve(0, 1, prices);
    }

    private int solve(int i, int canBuy, int[] prices) {
        if (i == prices.length) return 0;

        if (dp[i][canBuy] != -1)
            return dp[i][canBuy];

        int profit;
        if (canBuy == 1) {
            int buy = -prices[i] + solve(i + 1, 0, prices);
            int skip = solve(i + 1, 1, prices);
            profit = Math.max(buy, skip);
        } else {
            int sell = prices[i] + solve(i + 1, 1, prices);
            int skip = solve(i + 1, 0, prices);
            profit = Math.max(sell, skip);
        }

        dp[i][canBuy] = profit;
        return profit;
    }
}
