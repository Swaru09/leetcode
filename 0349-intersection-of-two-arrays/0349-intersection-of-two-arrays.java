class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> temp=new HashSet<>();
        int n=nums1.length;
        int m=nums2.length;
        
        for(int i=0;i<n;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<m;i++){
            if(set.contains(nums2[i])){
                temp.add(nums2[i]);
            }
        }
        int[] tempo=new int[temp.size()];
        int i=0;
        for(int t:temp){
            tempo[i++]=t;
        }
        return tempo;
    }
}