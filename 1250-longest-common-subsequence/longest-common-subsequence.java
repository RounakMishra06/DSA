class Solution {
    Integer dp[][];
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        dp=new Integer[m][n];
        solve(m-1,n-1,text1,text2);
        return dp[m-1][n-1];
    }
    public int solve(int m,int n,String t1,String t2)
    {
        if(m<0 ||n<0) return 0;
        if(dp[m][n]!=null) return dp[m][n];
        if(t1.charAt(m)==t2.charAt(n))
        {
            dp[m][n]=1+solve(m-1,n-1,t1,t2);
        }
        else
        {
            dp[m][n]=Math.max(solve(m-1,n,t1,t2),
            solve(m,n-1,t1,t2));
        }
        return dp[m][n];
    }
}