class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(num%k==0){
                set.add(num);
            }
        }
        int mizz=0;
        int t=k;
        for(int i=0;i<=nums.length;i++){
            if(set.contains(t)){
                t+=k;
            }else{
                mizz=t;
                break;
            }
        }
    return mizz;

    }
}