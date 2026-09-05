class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=0;
        int n=nums.length;
        double avg=Double.NEGATIVE_INFINITY;
        double avg1=0;
        double sum=0;
        while(j<n){
            sum=sum+nums[j];
            if(j>=k-1){
                avg1=sum/k;
                avg=Math.max(avg,avg1);
                sum=sum-nums[i];
                i++;
            }
            j++;
        }
        return avg;
    }
}