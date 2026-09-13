class Solution {
    public int minOperations(String s) {
        int count  = 0;
        for(int i = 0; i < s.length(); i++){
            count+=(s.charAt(i)^i) & 1;
        }
        return Math.min(count, s.length()-count);
    }
}