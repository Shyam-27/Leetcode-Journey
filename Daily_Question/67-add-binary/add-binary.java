class Solution {
    public String addBinary(String a, String b) {
        
        int i = a.length() - 1;
        int j = b.length() - 1;

        StringBuilder res = new StringBuilder();
        int carry = 0;
        while (i >= 0 || j >= 0 || carry != 0){
            int x = 0;
            int y = 0;

            if(i >= 0){
                x = a.charAt(i) - '0';
                i--;
            }

            if (j >= 0){
                y = b.charAt(j) - '0';
                j--;
            }

            int sum = x ^ y ^ carry;

            int nextCarry = (x & y) |(x & carry) | (y & carry);

            res.append(sum);
            carry = nextCarry;
        }

        return res.reverse().toString();

    }
}