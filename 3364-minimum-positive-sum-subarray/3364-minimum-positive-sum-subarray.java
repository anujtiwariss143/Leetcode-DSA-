class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minsum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            int currsum = 0;
            for (int j = i; j < nums.size(); j++) {
                currsum += nums.get(j);
                int length = j - i + 1;
                if (length > r) {
                    break;
                }
                if (length >= l && currsum > 0) {
                    minsum = Math.min(minsum, currsum);
                }
            }
        }
        if(minsum==Integer.MAX_VALUE) return -1;
        return minsum;

    }
}