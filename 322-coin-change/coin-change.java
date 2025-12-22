// class Solution {
//     public int coinChange(int[] coins, int amount) {
//          int[] dp = new int[amount + 1];
//          for (int i = 1; i <= amount; i++) {
//             dp[i] = amount + 1;
//         }
//           dp[0] = 0; 
    
//     for (int i = 1; i <= amount; i++) { 
//             for (int coin : coins) {
//                 if (coin <= i) {
//                     dp[i] = Math.min(dp[i], dp[i - coin] + 1);
//                 }}
//             }
//             return dp[amount] > amount ? -1 : dp[amount];
//         }
// }

class Solution {

    int[] dp;

    public int coinChange(int[] coins, int amount) {
        dp = new int[amount + 1];
        for (int i = 0; i <= amount; i++) dp[i] = -2; // -2 = unvisited

        return solve(coins, amount);
    }

    int solve(int[] coins, int amt) {

        if (amt == 0) return 0;
        if (amt < 0) return -1;

        if (dp[amt] != -2) return dp[amt];

        int ans = Integer.MAX_VALUE;

        for (int c : coins) {
            int res = solve(coins, amt - c);
            if (res >= 0) {
                ans = Math.min(ans, res + 1);
            }
        }

        dp[amt] = (ans == Integer.MAX_VALUE) ? -1 : ans;
        return dp[amt];
    }
}
