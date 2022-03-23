class Solution {
    public int[] singleNumber(int[] nums) {
        int exor = 0;
        for(int n : nums){
            exor ^= n;
        }
        int k = 0;
        while((exor & 1<<k) == 0){
            k++;
        }
        int one = 0, two = 0;
        for(int n : nums){
            if((1<<k & n) != 0)one ^= n;
            else two ^= n;
        }
        return new int[]{one, two};
    }
}
