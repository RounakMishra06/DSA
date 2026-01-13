class Solution {
    int[][] dp;

    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        int n = words.length;
        dp = new int[n][n + 1];
        for (int i = 0; i < n; i++){
            Arrays.fill(dp[i], -1);
        }
        return solve(0, -1, words);
    }

    int solve(int i, int prev, String[] words){
        if (i == words.length) return 0;
        if (dp[i][prev + 1] != -1) return dp[i][prev + 1];
        int notTake = solve(i + 1, prev, words);
        int take = 0;
        if (prev == -1 || isPredecessor(words[prev], words[i])){
            take = 1 + solve(i + 1, i, words);
        }
        dp[i][prev + 1] = Math.max(take, notTake);
        return dp[i][prev + 1];
    }
    boolean isPredecessor(String prev, String curr){
        if (curr.length() != prev.length() + 1) return false;
        int i = 0, j = 0;
        while (i < prev.length() && j < curr.length()){
            if (prev.charAt(i) == curr.charAt(j)){
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == prev.length();
    }
}
