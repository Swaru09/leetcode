class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
        for(int num:nums){
            if(i<2|| num>nums[i-2]){
                nums[i]=num; //4 
                i++; //
            }
        }
        return i;
    }
}