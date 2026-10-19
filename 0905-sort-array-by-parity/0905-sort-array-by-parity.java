class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int k = 0;
        for (int num : nums) {
            if (num % 2 == 0)
                ans[k++] = num;
        }
        for (int num : nums) {
            if (num % 2 != 0)
                ans[k++] = num;
        }
        return ans;
    }
}