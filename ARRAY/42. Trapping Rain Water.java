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
