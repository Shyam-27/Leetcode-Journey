class Solution {
    public boolean canTransform(int[] source, int[] target) {
        long sum1 = 0;
        long sum2 = 0;

        if ( source.length != target.length) return false;

        if( source.length == 1) return source[0] == target[0];

        
        for( int i = 0; i < source.length; i++){
            if (source[i] < 0){
                sum1 += Math.abs(source[i]);
            }else{
                sum1 -= source[i];
            }

            if (target[i] < 0){
                sum2 += Math.abs(target[i]);
            }else{
                sum2 -= target[i];
            }
            
        }
        if(sum1 == sum2) return true;

        return false;
        
    }
}