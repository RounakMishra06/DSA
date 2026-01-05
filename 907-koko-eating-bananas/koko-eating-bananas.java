class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for (int p : piles) {
            high = Math.max(high, p);
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canEat(piles, h, mid)) {
                ans = mid;
                high = mid - 1; // try slower
            } else {
                low = mid + 1;  // need faster
            }
        }
        return ans;
    }

    private boolean canEat(int[] piles, int h, int k) {
        long hours = 0;

        for (int p : piles) {
            hours += (p + k - 1) / k; // ceil division
            if (hours > h) return false;
        }
        return true;
    }
}
