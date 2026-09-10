class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char s1=s.charAt(i);
            char s2 =t.charAt(i);
            if(map1.containsKey(s1) && map1.get(s1)!=s2) return false;
            if(map2.containsKey(s2) && map2.get(s2)!=s1) return false;
            map1.put(s1,s2);
            map2.put(s2,s1);
        }
        return true;
    }
}