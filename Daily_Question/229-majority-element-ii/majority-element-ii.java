class Solution {
    public List<Integer> majorityElement(int[] nums) {
      HashMap<Integer, Integer> set = new HashMap<>();
      Set<Integer> se = new HashSet<>();
      for(int n : nums){
        set.put(n, set.getOrDefault(n,0)+1);

        if(set.get(n)>nums.length/3){
            se.add(n);
        }
      }
      List<Integer> res = new ArrayList<>(se);
      return res;
    } 
}