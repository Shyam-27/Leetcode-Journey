class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n = nums.length;
        int Res = 0;
        boolean flag = false;
        HashMap<Integer, ArrayList<Integer>> arr = new HashMap<>();

        for(int i = 0;i<n; i++){
            arr.putIfAbsent(nums[i], new ArrayList<>());
            arr.get(nums[i]).add(i);
        }

        for(ArrayList<Integer> index : arr.values()){

            if(index.size() >= 3){
                int diff = index.get(1)-index.get(0);
                for(int i =2;i<index.size();i++){
                    if(index.get(i)-index.get(i-1) == diff){
                        flag = true;
                    }else{
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    Res++;
                }
            } 
        }
        return Res;
    }
}