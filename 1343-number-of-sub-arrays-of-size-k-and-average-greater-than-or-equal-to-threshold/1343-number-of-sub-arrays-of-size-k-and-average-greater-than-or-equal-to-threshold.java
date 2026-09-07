class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int sum=0;
        int count=0;
        for(int z=0;z<k;z++){
            sum +=arr[z];

        }
        double avg=sum/k;
        if(avg>=threshold){
            count++;
            }
        int i=0;
        int j=k;

        while(j<n){
            sum=sum-arr[i];
            sum=sum+arr[j];
             avg=sum/k;
            if(avg>=threshold){
                count++;
            }
            i++;
            j++;
        }
        return count;
    }
}