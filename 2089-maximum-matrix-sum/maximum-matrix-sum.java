class Solution {
    public long maxMatrixSum(int[][] matrix) {

        long sum = 0;
        int negativeCount = 0;
        int minAbs = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                int val = matrix[i][j];

                if (val < 0) {
                    negativeCount++;
                }

                sum += Math.abs(val);
                minAbs = Math.min(minAbs, Math.abs(val));
            }
        }

        if (negativeCount % 2 != 0) {
            sum -= 2L * minAbs;
        }

        return sum;
    }
}
