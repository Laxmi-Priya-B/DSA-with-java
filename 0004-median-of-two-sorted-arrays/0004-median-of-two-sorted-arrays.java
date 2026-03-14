class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            merged[i] = nums1[i];
        }
        int j=0;
        for(int i=nums1.length;i<merged.length;i++){
            merged[i] = nums2[j];
            j++;
        }
        Arrays.sort(merged);
        double median =0;
        int n = merged.length;
        if(n%2==1){
            return merged[n/2];
        }
        return (merged[n/2] + merged[n/2 - 1]) / 2.0; 
    }
}