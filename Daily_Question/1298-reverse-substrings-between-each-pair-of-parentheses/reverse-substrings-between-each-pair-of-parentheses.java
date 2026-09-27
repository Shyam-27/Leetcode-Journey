class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder cur = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(cur);
                cur = new StringBuilder();
            } else if (ch == ')') {
                cur.reverse();

                StringBuilder prev = stack.pop();
                prev.append(cur);

                cur = prev;
            }
            else{
                cur.append(ch);
            }
        }

        return cur.toString();
    }
}