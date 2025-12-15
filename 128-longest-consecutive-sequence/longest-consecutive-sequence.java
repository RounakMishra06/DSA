

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }

        int l = 0;

        for (int x : set) {
            if (!set.contains(x - 1)) {  
                int c = x;
                int ct = 1;

                while (set.contains(c + 1)) {
                    c++;
                    ct++;
                }

                l = Math.max(l, ct);
            }
        }
        return l;
    }
}
