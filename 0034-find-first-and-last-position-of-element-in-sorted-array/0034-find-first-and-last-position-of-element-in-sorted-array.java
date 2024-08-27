class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] temp={-1,-1};
        temp[0]=firstOccurence(nums,target);
        temp[1]=lastOccurence(nums,target);
        return temp;
    }
    private int firstOccurence(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        int fp=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                fp=mid;
                end=mid-1;
            }else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return fp;
    }
    private int lastOccurence(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        int lp=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                lp=mid;
                start=mid+1;
            }else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return lp;
    }
}