class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int sign = 1;
        int n = s.length();
        long num = 0;

        // Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i == n) return 0;

        // Sign check
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        // Digit conversion
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');

            // Overflow handling (BEST place)
            if (sign == 1 && num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign == -1 && -num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }

        return (int)(sign * num);
    }
}
