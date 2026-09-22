class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,1);
        }
        int multiple=k;
        while(map.containsKey(multiple)){
            multiple+=k;
        }
        return multiple;
    }
}