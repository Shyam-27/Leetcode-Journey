class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum=0;
        long Maxsum=0;

        HashSet<Integer> set = new HashSet<>();

        int j=0;

        for(int i=0;i<nums.length;i++){
            while(set.contains(nums[i])){
                set.remove(nums[j]);
                sum-=nums[j];
                j++;
            }

            set.add(nums[i]);
            sum+=nums[i];

            if(i-j+1>k){
                set.remove(nums[j]);
                sum-=nums[j];
                j++;
            }

            if(i-j+1==k){
                Maxsum=Math.max(sum,Maxsum);
            }
        }
        return Maxsum;
    }
}