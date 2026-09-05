class Solution {
    public int[] searchRange(int[] nums, int target) {
       
       int first=firstOcc(nums,target);
       int last = lastOcc(nums,target);

       return new int[]{first,last};


    }


    public int firstOcc(int[] nums, int X){
        
        int left=0;
        int right = nums.length-1;
        int res=-1;
        while(left<=right){

            int mid=left+(right-left)/2;


            if(nums[mid]==X){
                res=mid;
                right=mid-1;
            }else if(nums[mid]<X){
                left=mid+1;
            }else{
                right=mid-1;
            }

        }
        return res;

    }


    public int lastOcc(int[] nums, int X){
        int left=0;
        int right = nums.length-1;
        int res=-1;

        while(left<=right){

            int mid=left+(right-left)/2;


            if(nums[mid]==X){
               res=mid;
               left=mid+1;
            }else if(nums[mid]>X){
                right=mid-1;
            }else{
                left=mid+1;
            }

        }
            return res;
    }

}