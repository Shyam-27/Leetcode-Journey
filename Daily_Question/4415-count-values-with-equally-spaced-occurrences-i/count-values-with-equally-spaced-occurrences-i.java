class Solution {
    public int countSpecialIntegers(int[] nums) {
        int Res = 0;

        int n = nums.length;
        HashMap<Integer, ArrayList<Integer>> arr = new HashMap<>();

        for(int i=0;i<n;i++){
            arr.putIfAbsent(nums[i], new ArrayList<>());
            arr.get(nums[i]).add(i);
        }

        for(ArrayList<Integer> num : arr.values()){

            if(num.size() == 3){
                int i1= num.get(0);
                int i2= num.get(1);
                int i3 = num.get(2);

                if(i2-i1 == i3-i2){
                    Res++;
                }
            }
            
        }
        return Res;
    }
}