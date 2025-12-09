class Solution {
    public int rob(int[] nums) {
        int n = nums.length - 1;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return solve(nums, n, dp);
    }

    private int solve(int[] nums, int i, int[] dp) {

        if (i < 0) 
            return 0;

        if (dp[i] != -1)
            return dp[i];

        int pick = nums[i] + solve(nums, i - 2, dp);
        int notPick = solve(nums, i - 1, dp);

        dp[i] = Math.max(pick, notPick);
        return dp[i];
    }
}
