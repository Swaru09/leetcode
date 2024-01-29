class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] merged =new int[m+n];
        int k=0;
        for (int i=0;i<n;i++){
            merged[k]=nums1[i];
            k++;
        }
        for (int i=0;i<m;i++){
            merged[k]=nums2[i];
            k++;
        }
        Arrays.sort(merged);
        int total=merged.length;
        if(total%2==1){
            return (double)merged[total/2];
        }
        else{
            int middle1= merged[total/2];
            int middle2=merged[total/2-1];
            return ((double)middle1+(double)middle2)/2.0;
        }
        
    }
}