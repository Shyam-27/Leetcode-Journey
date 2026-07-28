class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int p=0;
        int q=numbers.length-1;
        int[] arr=new int[2];

        while(q<numbers.length){
            int sum=numbers[p]+numbers[q];
            if(sum==target){
                arr[0]=p+1;
                arr[1]=q+1;
                break;
            }else if(sum>target){
                q--;
            }else{
                p++;
            }
        }
        return arr;
    }
}