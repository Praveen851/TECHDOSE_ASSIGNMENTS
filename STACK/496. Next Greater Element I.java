class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<Integer>();
        int l1 = nums1.length, l2 = nums2.length;
        int[] arr = new int[l2];
        int[] res = new int[l1];
        stack.push(0);
        for(int i = 1; i < l2; i++){
            if(stack.empty() || nums2[i] <= nums2[stack.peek()])stack.push(i);
            else{
                while(!stack.empty() && nums2[i] > nums2[stack.peek()]){
                    arr[stack.pop()] = nums2[i];
                }
                stack.push(i);
            }
        }
        for(int i = 0; i < l1; i++){
            for(int j = 0; j < l2; j++){
                if(nums1[i] == nums2[j])res[i] = arr[j] == 0?-1:arr[j];
            }
        }
        return res;
    }
}
