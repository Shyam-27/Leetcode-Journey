class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> res = new HashMap<>();

        for( int n : nums){
            res.put(n, res.getOrDefault(n,0)+1);

            if(res.get(n)>nums.length/2){
                return n;
            }
        }
        return -1;
    }
}