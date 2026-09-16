class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                int len = right - left + 1;
                minLen = Math.min(minLen, len);
                sum -= nums[left];
                left++;
            }

        }
        if (minLen == Integer.MAX_VALUE) {
            return 0;
        }

        return minLen;
    }
}