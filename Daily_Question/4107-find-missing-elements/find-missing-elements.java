class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> st = new HashSet<>();

        int mins=Integer.MAX_VALUE;
        int maxs=Integer.MIN_VALUE;

        for(int x  : nums){
            st.add(x);
            mins=Math.min(mins,x);
            maxs=Math.max(maxs,x);
        }

        List<Integer> ans=new ArrayList<>();

        for(int i=mins+1;i<maxs;i++){
            if(!st.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}