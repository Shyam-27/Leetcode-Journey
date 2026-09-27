class Solution {
    public int[] rearrangeArray(int[] nums) {
        TreeMap<Integer, Integer> freq = new TreeMap<>();

        for (int num : nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        int[] ans = new int[nums.length];
        int index = 0;

        while(!freq.isEmpty()){
            List<Integer> remove = new ArrayList<>();

            for(int num : freq.keySet()){
                ans[index++] = num;
                int count = freq.get(num);

                if(count == 1){
                    remove.add(num);
                }else{
                    freq.put(num, count - 1);
                }
            }

            for (int num : remove){
                freq.remove(num);
            }
        }

        return ans;
        
    }
}