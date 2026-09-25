class Solution {
    public int divide(int dividend, int divisor) {
        
        if (dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) != (divisor < 0);

        long dividend_a = Math.abs((long) dividend);
        long divisor_b = Math.abs((long) divisor);

        long quotient = 0;

        while (dividend_a >= divisor_b){
            long temp = divisor_b;
            long multiple = 1;

            while (dividend_a >= (temp << 1)){
                temp = temp << 1;
                multiple = multiple << 1;
            }
            dividend_a = dividend_a - temp;

            quotient = quotient + multiple;
        }

        if (negative){
            quotient = -quotient;
        }

        return (int) quotient;

    }
}