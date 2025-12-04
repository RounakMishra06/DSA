class Solution {
    public int climbStairs(int n) {
        // if (n <= 2) return n;

        // int first = 1;  
        // int second = 2; 
        // int current = 0;

        // for (int i = 3; i <= n; i++) {
        //     current = first + second;
        //     first = second;
        //     second = current;
        // }

        // return current;//{space optimization}

        int[] dp = new int[n+1];
        return a(n, dp);

    }
      private int a(int n, int dp[]){
      if(n<=2) return n;
      if(dp[n] != 0) return dp[n];
      dp[n]=a(n-1,dp)+a(n-2,dp);
      return dp[n];

    }
}
