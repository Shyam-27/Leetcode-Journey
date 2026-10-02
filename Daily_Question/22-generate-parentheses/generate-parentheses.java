class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> brac = new ArrayList<>();

        dfs(0,0,"",n,brac);
        return brac;
    }
    public void dfs(int open, int close, String s,int n, List<String> brac){
        if (open == close && open + close == 2 * n){
            brac.add(s);
            return;
        }

        if (open < n){
            dfs(open + 1, close, s + "(", n, brac);
        }


        if(close < open){
            dfs (open, close + 1, s + ")", n, brac);
        }
    }
}