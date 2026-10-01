class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();


        for(char c : s.toCharArray()){
            if(c == '(' || c =='{' || c == '['){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;

                char top = stack.pop();

                if(c == ')' && top != '(' || c == ']' && top != '[' || c == '}' && top != '{' ){
                    return false;
                }
            }
        }        
        
        return stack.isEmpty();
    }
}