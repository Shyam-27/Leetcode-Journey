class Solution {

    private int robFrom(int[] nums, int start, int end, int[] memo) {

        if (start > end)
            return 0;

        if (memo[start] != -1)
            return memo[start];

        int rob = nums[start] + robFrom(nums, start + 2, end, memo);
        int skip = robFrom(nums, start + 1, end, memo);

        memo[start] = Math.max(rob, skip);
        return memo[start];
    }

    public int rob(int[] nums){

        int n=nums.length;

        if (n==1)
            return nums[0];

        int[] memo1=new int[n];
        int[] memo2=new int[n];

        Arrays.fill(memo1,-1);
        Arrays.fill(memo2,-1);

        int case1 = robFrom(nums,0,n-2,memo1);
        int case2 = robFrom(nums, 1, n - 1, memo2);

        return Math.max(case1, case2);
    }
}