class Solution {
    public int[] runningSum(int[] nums) {
     final int n=nums.length;
     int[] ans= new int[n];
     ans[0]=nums[0];
     for(int i=1;i<n;i++){
         ans[i]=ans[i-1]+nums[i];
     } 
     return ans;  
    }
}