class Solution {
    public int search(int[] nums, int target) {        
        int high = nums.length - 1, low = 0, mid;
        while(low <= high){
            mid = (low + high) / 2;
            if(nums[mid] == target)return mid;
            else if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target <= nums[mid])high = mid-1;
                else low = mid+1;
            }
            else{
                if(target >= nums[mid] && target <= nums[high])low = mid+1;
                else high = mid-1;
            }
        }
        return -1;
    }
}
