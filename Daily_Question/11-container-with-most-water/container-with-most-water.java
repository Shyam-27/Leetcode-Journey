class Solution {
    public int maxArea(int[] height) {
        int left =0, right=height.length-1;

        int maxs=0, curr=0;

        while(left<right){
            if(height[left]<height[right]){
                curr=(right-left)*height[left];
                maxs=Math.max(curr,maxs);
                left++;
            }else{
                curr=(right-left)*height[right];
                maxs=Math.max(curr,maxs);
                right--;
            }
        }
        return maxs;
    }
}