class Solution {
    public boolean canAliceWin(int[] nums) {
        int singles=0;
        int doubles=0;
        for(int num:nums){
            if(num<10){
                singles+=num;
            }else
            doubles+=num;
        }
        return singles!=doubles;
    }
}