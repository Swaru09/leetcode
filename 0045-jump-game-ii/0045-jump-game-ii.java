class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        if(n<=1){
            return 0;
        }
        int numberofjumps=0;
        int maxindex=0;
        int currentindex=0;
        for(int i=0;i<n;i++){
            maxindex=Math.max(maxindex,i+nums[i]);
            if (i==currentindex){
                numberofjumps++;
                currentindex=maxindex;
                if (currentindex>=n-1){
                    break;
                }
            }
            
            
        }
        return numberofjumps;
    }
}