class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> arr = new HashMap<>();

        arr.put(0,-1);

        int pre = 0;

        for(int i=0;i<nums.length;i++){
            pre+=nums[i];

            int rem = pre%k;

            if(arr.containsKey(rem)){
                int preInd = arr.get(rem);
                if(i-preInd>=2){
                    return true;
                }
            }else{
                arr.put(rem,i);
            }
        }
        return false;
    }
}