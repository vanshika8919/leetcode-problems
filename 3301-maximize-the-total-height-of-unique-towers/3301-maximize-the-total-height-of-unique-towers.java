class Solution {
    public long maximumTotalSum(int[] maximumHeight) {
        int n = maximumHeight.length;
        Arrays.sort(maximumHeight);
        int pre_h = maximumHeight[n - 1];
        long sum = 0;

        for (int i = n - 1; i >= 0; i--) {
            pre_h = Math.min(pre_h, maximumHeight[i]);
            if (pre_h <= 0) {
                return -1;
            }
            sum += pre_h;
            pre_h--;
        }

        return sum;
    }
}