class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0 || s.charAt(0) == '0') return 0;

        int prev2 = 1;
        int prev1 = 1;

        for (int i = 1; i < n; i++) {
            int cur = 0;

            if (s.charAt(i) != '0') {
                cur += prev1;
            }

            int two = (s.charAt(i - 1) - '0') * 10 + (s.charAt(i) - '0');
            if (two >= 10 && two <= 26) {
                cur += prev2;
            }

            prev2 = prev1;
            prev1 = cur;
        }
        return prev1;
    }
}
