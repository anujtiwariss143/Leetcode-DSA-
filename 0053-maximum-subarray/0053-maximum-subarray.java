class Solution {
    public int maxSubArray(int[] nums) {
        int i=0;
        int j=0;
        int sum=0;
        int maxsum=nums[0];
        while(j<nums.length){
            sum+=nums[j];
            maxsum=Math.max(maxsum,sum);
            if(sum<0){
                i=j+1;
                j=i;
                sum=0;
            }else{
                j++;
            }
        }
        return maxsum;
    }
}