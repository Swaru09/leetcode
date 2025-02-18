class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=0;
        long sum=0;
        for(int l=0,r=0;r <nums.length;r++){
            sum+=nums[r];
            while((sum+k)<((long)nums[r]*(r-l+1))){
                sum-=nums[l];
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;

    }
}