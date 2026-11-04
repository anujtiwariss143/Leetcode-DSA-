class Solution {
    public int secondHighest(String s) {
        HashSet<Integer> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                set.add(ch - '0');
            }
        }
        int max = -1;
        int second = -1;
        for (int num : set) {
            if (num > max) {
                second = max;
                max = num;
            } 
            else if (num > second) {
                second = num;
            }
        }
        return second;
    }
}
