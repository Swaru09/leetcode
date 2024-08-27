class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int d=n+m;
        int[] temp=new int[d];
        for(int i=0;i<n;i++){
            temp[i]=nums1[i];
        }
        for(int i=0;i<m;i++){
            temp[i+n]=nums2[i];
        }
        Arrays.sort(temp);
        if(d%2==1){
            double r=temp[d/2];
            return r;
        }
        else{
            double r=temp[d/2]+temp[(d/2)-1];
            return r/2.0;
        }
    }
}