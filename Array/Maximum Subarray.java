/*

Leetcode 53. Maximum Subarray
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:
Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.



*/

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int num : nums) {
            sum+=num;
            maxSum=sum>maxSum?sum:maxSum;

            sum=sum<0?0:sum;
        }
        
        return maxSum;
    }
}