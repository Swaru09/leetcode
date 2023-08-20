class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int pre[] = new int[n];
        int post[] = new int[n];
        int ans[] = new int[n];
        int temp=1;
        for(int i=0; i<n; i++){
            temp*=nums[i];
            pre[i]=temp;
        }
        temp=1;
        for(int i=n-1; i>=0; i--){
            temp*=nums[i];
            post[i]=temp;
        }
        ans[0]=post[1];
        ans[n-1]=pre[n-2];
        for(int i=1; i<n-1; i++){
            ans[i]=pre[i-1]*post[i+1];
        }
        return ans;
    }
}