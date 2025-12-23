class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        
       Integer[][] dp=new Integer[m+1][n+1];
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
                if(word1.charAt(i-1)==word2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        int i=m;
        int j=n;
        while(i>0 && j>0)
        {
            if(word1.charAt(i-1)==word2.charAt(j-1))
            {
                sb.append(word1.charAt(i-1));
                i--;
                j--;
            }
            else if (dp[i-1][j]>=dp[i][j-1]) {
                i--;                
            }
            else
            {
                j--;
            }
            
        }
        
        return (m+n)-(2*sb.length());
    }
}