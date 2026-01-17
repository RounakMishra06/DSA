class Solution {

    public int dp(int n , int[] dp) {
       if(n<=1) return n;
       if(dp[n]!=0) return dp[n];

        return dp[n] =  fib(n-1)+fib(n-2);
    }


    public int tab(int n) {
        if(n==0) return 0;
        int[] dp = new int[n+1];

        dp[1] = 1;
        for(int i=2;i<=n;i++)
        {

            dp[i] =  dp[i-1] + dp[i-2];

        }

        return dp[n];


    }
    
    
  
    public int fib(int n) {

        // int[] arr = new int[n+1];
        // return dp(n , arr);
        return tab(n);
    }
}