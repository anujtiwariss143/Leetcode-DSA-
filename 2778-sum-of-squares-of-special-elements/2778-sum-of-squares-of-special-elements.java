class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0;
        for(int i=1;i<=nums.length;i++){
            int num=i;
            if(nums.length%num==0){
                int square=nums[num-1]*nums[num-1];
                sum+=square;
            }
        }
        return sum;
    }
}