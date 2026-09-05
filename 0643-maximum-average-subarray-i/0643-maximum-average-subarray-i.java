class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=0;
        int n=nums.length;
        double avg=0;
        // double maxsum=0;
        double sum=0;
        for(int z=0;z<k;z++){
            sum+=nums[z];
        }
        if(n<=k){
            return sum/k;
        }
        double maxsum=sum;
        i=0;
        j=k;
        while(j<n){
            sum=sum-nums[i];
            sum=sum+nums[j];
            maxsum=Math.max(sum,maxsum);
            i++;
            j++;
        }
        return maxsum/k;
    }
}