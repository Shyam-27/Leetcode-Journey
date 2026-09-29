class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int base = 0;
        int sign = 1;
        int n = s.length();

        while( i < n && s.charAt(i) == ' '){
            i++;
        }

        if (i == n) return 0;

        if (s.charAt(i) == '-' || s.charAt(i) == '+'){
            sign = (s.charAt(i) == '-')? -1 : 1;
            i++;
        }

        while ( i < n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';

            if (base > max / 10 || (base == max /10 && (digit > 7))){
                return (sign == 1) ? max : min;
            }

            base = base * 10 + digit;
            i++;
        }
        return base * sign;
    }
}