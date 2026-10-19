class Solution {
    public String intToRoman(int num) {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < nums.length; ++i){
            if (num == 0) break;

            while (num >= nums[i]){
                str.append(romans[i]);
                num-=nums[i];
            }
        }
        return str.toString();
    }
}