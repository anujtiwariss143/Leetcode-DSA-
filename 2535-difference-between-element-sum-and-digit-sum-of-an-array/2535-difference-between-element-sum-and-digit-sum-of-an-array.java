class Solution {
    public int differenceOfSum(int[] nums) {
        int elementsum = 0;
        int digitsum = 0;
        for (int num : nums) {
            elementsum += num;
            int temp=num;
            while(temp!=0){
                int digits = temp % 10;
                digitsum += digits;
                temp /= 10;
            }
        }
        return Math.abs(elementsum - digitsum);
    }
}