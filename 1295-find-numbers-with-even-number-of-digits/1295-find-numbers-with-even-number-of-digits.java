class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            int digitcount=0;
            while(num!=0){
            num/=10;
            digitcount++;
            }
            if(digitcount%2==0) count++;
        }
        return count;
    }
}