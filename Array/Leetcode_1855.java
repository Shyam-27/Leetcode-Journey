/*

Leetcode  : 1855. Maximum Distance Between a Pair of Values
Given two non-increasing 0-indexed integer arrays nums1 and nums2, return the
maximum distance of a pair of indices (i, j) such that i <= j and nums1[i] <= nums2[j]. If there are no such pairs, return 0.

Example 1:
Input: nums1 = [55,30,5,4,2], nums2 = [100,20,10,10,5]
Output: 2
Explanation: The valid pairs are:
- (0, 0): nums1[0] = 55 <= nums2[0] = 100
- (0, 1): nums1[0] = 55 <= nums2[1] = 20
- (0, 2): nums1[0] = 55 <= nums2[2] = 10
- (0, 3): nums1[0] = 55 <= nums2[ 3] = 10
- (0, 4): nums1[0] = 55 <= nums2[4] = 5
- (1, 1): nums1[1] = 30 <= nums2[1] = 20
- (1, 2): nums1[1] = 30 <= nums2[2] = 10
- (1, 3): nums1[1] = 30 <= nums2[3] = 10
- (1, 4): nums1[1] = 30 <= nums2[4] = 5
- (2, 2): nums1[2] = 5 <= nums2[2] = 10
- (2, 3): nums1[2] = 5 <= nums2[3] = 10
- (2, 4): nums1[2] = 5 <= nums2[4] = 5
The maximum distance is 2, which occurs at (0, 4) with nums1[0] <= nums2[4].  

*/

class Solution {
  public int maxDistance(int[] nums1, int[] nums2){
    int i=0,j=0,res=0;

    while(i<nums1.length && j<nums2.length){
      if(nums1[i]<=nums2[j]){
        res=Math.max(res,j-i);
        j++;
      }else{
        i++;
      }
      return res;
    }
  }