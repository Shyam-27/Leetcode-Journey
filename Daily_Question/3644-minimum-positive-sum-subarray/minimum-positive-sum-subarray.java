class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
       int n = nums.size();
       int best = Integer.MAX_VALUE;

       for (int i = l; i <= r; i++){
        for (int j = 0; j + i <= n; j++){
            int sum = 0;
            for (int k = j; k < j+i; k++){
                sum += nums.get(k);
            }
            if(sum > 0 && sum < best) best = sum;
        }
       }
       return best == Integer.MAX_VALUE ? -1: best;
    }
}