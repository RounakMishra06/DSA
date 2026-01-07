class Solution {
    int[][][] dp;

    public int maxProfit(int[] prices) {
        int n = prices.length;
        dp = new int[n][2][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }

        return solve(0, 1, 2, prices);
    }

    private int solve(int i, int canBuy, int cap, int[] prices) {
        if (i == prices.length || cap == 0)
            return 0;

        if (dp[i][canBuy][cap] != -1)
            return dp[i][canBuy][cap];

        int profit;

        if (canBuy == 1) {
            int buy = -prices[i] + solve(i + 1, 0, cap, prices);
            int skip = solve(i + 1, 1, cap, prices);
            profit = Math.max(buy, skip);
        } else {
            int sell = prices[i] + solve(i + 1, 1, cap - 1, prices);
            int skip = solve(i + 1, 0, cap, prices);
            profit = Math.max(sell, skip);
        }

        dp[i][canBuy][cap] = profit;
        return profit;
    }
}
