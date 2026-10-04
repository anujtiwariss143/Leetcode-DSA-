class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int start=1;
        while(set.contains(start)){
            start++;
        }
        return start;
    }
}