class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = nums1[0];
        int odd = 0;

        for (int x : nums1){
            min = Math.min(min, x);
            odd = odd | x & 1;
        }
        return (min & 1 ) == odd;
        
    }
}