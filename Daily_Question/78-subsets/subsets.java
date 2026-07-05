class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();

        subset(0,nums,res,new ArrayList<>());
        return res;
    }

    private void subset(int index, int[] nums, List<List<Integer>> res, List<Integer> temp){
        
        if(index>=nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[index]);
        subset(index+1,nums,res,temp);
        temp.remove(temp.size()-1);
        subset(index+1,nums,res,temp);
    }
}