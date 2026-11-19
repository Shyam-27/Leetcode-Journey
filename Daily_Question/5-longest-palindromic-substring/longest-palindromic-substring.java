class Solution {
    int start = 0;
    int maxLen = 0;
    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++){
            expand(s,i,i);

            expand(s,i,i+1);
        }
        return s.substring(start, start + maxLen);
    }
    public void expand(String s, int left, int right){
        while (
                left >= 0 &&
                right < s.length() &&
                s.charAt(left) == s.charAt(right)
               ){
                int length = right - left + 1;

                if (length > maxLen){
                    start = left;
                    maxLen = length;
                }
                left--;
                right++;
               }
    }
}