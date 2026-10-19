class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();

        if (numRows >= n || numRows == 1){
            return s;
        }
        
        StringBuilder[] str = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++){
            str[i] = new StringBuilder();
        }

        int cur = 0;
        int dir = 1;

        for (int i = 0; i < n; i++){
            str[cur].append(s.charAt(i));

            if (cur == 0){
                dir = 1;
            }else if (cur == numRows - 1){
                dir = -1;
            }
            cur += dir;
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; i++){
            res.append(str[i]);
        }
        
        return res.toString();
    }
}

