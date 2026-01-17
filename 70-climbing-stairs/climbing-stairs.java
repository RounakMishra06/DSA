class Solution {
    public int m(int n,int[] dp) {
    
     if(n<=1) return 1;
     if(dp[n]!=0)return dp[n];
     return dp[n] = m(n-1 , dp)+ m(n-2,dp);
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
      return m(n,dp);
    }
}