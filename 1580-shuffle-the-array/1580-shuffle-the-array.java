class Solution {
    public int[] shuffle(int[] nums, int n) {
        final int a=nums.length;
        int[] arr=new int[a];
        for(int i=0;i<n;i++){
            arr[i*2]=nums[i];
            arr[i*2+1]=nums[i+n];
        }
        return arr;
    }
}