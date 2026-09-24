class Solution {
    public int smallestIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int num = nums[i];
            while (num > 0) {
                int digits = num % 10;
                sum += digits;
                num /= 10;
            }
            if (i == sum)
                return sum;
        }
        return -1;
    }
}