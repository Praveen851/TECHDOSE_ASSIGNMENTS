// optimal solution O(N)space
class Solution {
    public int trap(int[] height) {
        int len = height.length;
        if(height.length < 3)return 0;
        int maxLeft[] = new int[len], maxRight[] = new int[len];
        int maxL = 0, maxR = 0;
        for(int i = 0; i < len; i++){
            maxLeft[i] = maxL;
            maxL = Math.max(maxL, height[i]);
        }
        for(int i = len-1; i >= 0; i--){
            maxRight[i] = maxR;
            maxR = Math.max(maxR, height[i]);
        }
        int water = 0;
        for(int i = 1; i < len-1; i++){
            if(height[i] >= Math.min(maxLeft[i], maxRight[i]))continue;
            water += (Math.min(maxLeft[i], maxRight[i]) - height[i]) * 1;
        }
        System.out.println();
        for(int i = 0; i < len; i++){
            System.out.print(maxRight[i]+" ");
        }
        return water;
    }
}

//O(1)
class Solution {
    public int trap(int[] height) {
        int len = height.length;
        if(height.length < 3)return 0;
        int maxL = height[0], maxR = height[len - 1];
        int left = 1, right = len-2, water = 0;
        while(left <= right){
            if(maxL < maxR){
                if(height[left] >= maxL){
                    maxL = height[left];
                }
                else{
                    water += maxL - height[left];
                }
                left++;
            }
            else{
                if(height[right] >= maxR){
                    maxR = height[right];
                }
                else{
                    water += maxR - height[right];
                }
                right--;
            }
        }
        return water;
    }
}
