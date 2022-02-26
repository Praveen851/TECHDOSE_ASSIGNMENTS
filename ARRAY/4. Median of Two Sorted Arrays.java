class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length, l2 = nums2.length;
        int[] nums3 = new int[l1 + l2];
        int k = 0, i = 0, j = 0;
        while(i < l1 && j < l2){
            if(nums1[i] < nums2[j])
            nums3[k++] = nums1[i++];
            else nums3[k++] = nums2[j++];
        }
        while(i < l1)nums3[k++] = nums1[i++];
        while(j < l2)nums3[k++] = nums2[j++];
        
        if((l1+l2) % 2 == 1)return (double)nums3[(l1 + l2)/2];
        else return (double)(nums3[(l1+l2)/2] + nums3[((l1+l2)/2)-1])/2;
    }
}
