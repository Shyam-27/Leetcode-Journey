class Solution {
    public String removeOuterParentheses(String s) {
        int depth =0 ;
        StringBuilder res = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(depth > 0){
                    res.append(ch);
                }
                depth++;
            }else{
                depth--;
                
                if(depth > 0){
                    res.append(ch);
                }
            }
        }
        return res.toString();
    }
}