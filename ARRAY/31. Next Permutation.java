class Solution {
    public void swap(int i, int j, int[] a){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public void nextPermutation(int[] nums) {
        int l = nums.length - 1, peak = 0, i = l;
        while(i > 0){
            if(nums[i] > nums[i-1]){
                peak=i;
                break;
            }
            i--;
        }
        if(peak == 0){
            while(peak < l){
                swap(peak, l, nums);
                peak++;
                l--;
            }
            return;
        }
        int toSwap = l;
        while(nums[toSwap] <= nums[peak - 1]){
            toSwap--;
        }
        swap(toSwap, peak - 1, nums);
        while(peak < l){
            swap(peak, l, nums);
            peak++;
            l--;
        }
    }
}
