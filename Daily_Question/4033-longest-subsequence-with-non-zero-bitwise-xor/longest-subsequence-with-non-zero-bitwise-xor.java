class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int res=0;

        boolean zero=true;

        for(int x : nums){
            res=res^x;

            if(x>0){
                zero=false;
            }
        }
        if(res>0){
            return n;
        }

        return zero?0:n-1;
    }
}