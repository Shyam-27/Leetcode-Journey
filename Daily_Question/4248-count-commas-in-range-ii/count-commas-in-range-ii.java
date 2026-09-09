class Solution {
    public long countCommas(long n) {
		long rem = 0;
        long num = 1000;

        while(num<=n){
            rem+=n-num+1;
            num*=1000;
        }
       return rem;
    }
}