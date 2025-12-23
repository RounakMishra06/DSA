// class Solution {
//     Integer dp[][];
//     public int longestCommonSubsequence(String text1, String text2) {
//         int m=text1.length();
//         int n=text2.length();
//         dp=new Integer[m][n];
//         solve(m-1,n-1,text1,text2);
//         return dp[m-1][n-1];
//     }
//     public int solve(int m,int n,String t1,String t2)
//     {
//         if(m<0 ||n<0) return 0;
//         if(dp[m][n]!=null) return dp[m][n];
//         if(t1.charAt(m)==t2.charAt(n))                  // memoization
//         {
//             dp[m][n]=1+solve(m-1,n-1,t1,t2);
//         }
//         else
//         {
//             dp[m][n]=Math.max(solve(m-1,n,t1,t2),
//             solve(m,n-1,t1,t2));
//         }
//         return dp[m][n];
//     }
// }

// class Solution {
//     int ans;
//     public int longestCommonSubsequence(String text1, String text2) {
//         int m=text1.length();
//         int n=text2.length();
//         solve(m-1,n-1,text1,text2);          //recursion
//         return ans;
//     }
//     public int solve(int m,int n,String t1,String t2)
//     {
//         if(m<0 ||n<0) return 0;
//         if(t1.charAt(m)==t2.charAt(n))
//         {
//             ans=1+solve(m-1,n-1,t1,t2);
//         }
//         else
//         {
//             ans=Math.max(solve(m-1,n,t1,t2),solve(m,n-1,t1,t2));
//         } 

//         return ans;
//     }
// }
class Solution {
    Integer dp[][];
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        dp=new Integer[m+1][n+1];
        for(int i=0;i<=m;i++)
        {
            dp[i][0]=0;
        }
        for(int i=0;i<=n;i++)
        {
            dp[0][i]=0;
        }
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    // bottom up
}


