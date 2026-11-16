class Solution {
    public String digitSum(String s, int k) {
        if(s.length() == k){
            return s;
        }
        
        while(s.length() > k){
            StringBuilder res  = new StringBuilder();

            for (int i = 0; i < s.length(); i+=k){
                int sum = 0;

                for (int j = i; j < Math.min(i+k, s.length()); j++){
                    sum += s.charAt(j) - '0';
                }
                res.append(sum);
            }
            s = res.toString();
        }
        return s;
    }
}