class Solution {
    public int countCommas(int n) {
		int rem = 0;

        if(n>=1000){
            rem+=n-999;
        }else if(n>=100000){
            rem+=n-99999;
        }else if(n>=10000000){
            rem+=n-9999999;
        }
       return rem;
    }
}