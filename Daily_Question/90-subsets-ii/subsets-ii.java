class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        Subset(0,nums,res,new ArrayList<>());
        return res;
    }

    private void Subset(int index, int[] nums, List<List<Integer>> res, List<Integer> temp){

        res.add(new ArrayList<>(temp));

       for(int i=index;i<nums.length;i++){
        if(i>index && nums[i]==nums[i-1]){
            continue;
        }
        temp.add(nums[i]);
        Subset(i+1,nums,res,temp);
        temp.remove(temp.size()-1);
       }

    }
}