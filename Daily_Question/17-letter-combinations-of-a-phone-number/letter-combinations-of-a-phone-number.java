class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String> res = new ArrayList<>();

        if (digits.length() == 0){
            return res;
        }

        String[] alpha = {
            "","","abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(digits, 0, new StringBuilder(), alpha, res);
        return res;
    }

    private void backtrack(String digits, int ind, StringBuilder cur, String[] alpha, List<String> res){
        if (ind == digits.length()){
            res.add(cur.toString());
            return;
        }

        String letter = alpha[digits.charAt(ind) - '0'];

        for (int i = 0; i < letter.length(); i++){
            cur.append(letter.charAt(i));
            backtrack(digits, ind + 1, cur, alpha, res);
            cur.deleteCharAt(cur.length() - 1);
        }

    }
}