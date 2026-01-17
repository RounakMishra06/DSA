class Solution {

    public int dp(int n , int[] dp) {
       if(n<=1) return n;
       if(dp[n]!=0) return dp[n];

        return dp[n] =  fib(n-1)+fib(n-2);
    }
    
    
  
    public int fib(int n) {

        int[] arr = new int[n+1];
        return dp(n , arr);
    }
}