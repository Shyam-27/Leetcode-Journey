class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(candidates);
        Find(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }

    private void Find(int index, int[] arr, int target, List<List<Integer>> ans,List<Integer> temp){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            temp.add(arr[i]);
            Find(i+1,arr,target-arr[i],ans,temp);
            temp.remove(temp.size()-1);
        
        }
        
    }
}