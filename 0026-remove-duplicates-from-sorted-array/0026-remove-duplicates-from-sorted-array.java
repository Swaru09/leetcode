class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        // time complexity for this is O(nlogn)
        // Set<Integer> g=new HashSet<>();
        // for(int i=0;i<n;i++){
        //     g.add(nums[i]);
        // }
        // int index=0;
        // for (int c:g){
        //     nums[index]=c;
        //     index++;
        // }

        // time complexity is O(N)- 2 pointer approach

        int i=0;
        for(int j=1;j<n;j++){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }
}