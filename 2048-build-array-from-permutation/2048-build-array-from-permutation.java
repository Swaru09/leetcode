class Solution {
    public int[] buildArray(int[] nums) {
        final int n=nums.length;
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            int s=nums[i];
            arr[i]=nums[s];
        }
        return arr;
        
    }
}