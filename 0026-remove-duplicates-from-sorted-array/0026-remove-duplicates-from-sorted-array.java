class Solution {
    public int removeDuplicates(int[] nums) {
        int c=0;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.add(num)){
                nums[c++]=num;
            }
        }
        return c;
    }
}