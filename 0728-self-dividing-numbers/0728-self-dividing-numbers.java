class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=left;i<=right;i++){
            int num=i;
            while(num>0){
                int digits=num%10;
                if(digits==0 || i%digits !=0 ) break;
                num/=10;
            }
            if(num==0) list.add(i);
        }
        return list;
    }
}