class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                Set<Integer> hashset = new HashSet<>();

                for (int k = j + 1; k < n; k++) {
                    long sum = (long) nums[i] + nums[j] + nums[k]; long fourth = target - sum; if (fourth >= Integer.MIN_VALUE && fourth <= Integer.MAX_VALUE && hashset.contains((int) fourth)) { List<Integer> temp = Arrays.asList( nums[i], nums[j], nums[k], (int) fourth );
                        Collections.sort(temp);
                        ans.add(temp);
                    }

                    hashset.add(nums[k]);
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
