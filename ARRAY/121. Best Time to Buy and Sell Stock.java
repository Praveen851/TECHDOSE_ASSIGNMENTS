class Solution {
    public int maxProfit(int[] prices) {
        int left = 0, right = 1, maxP = 0;
        while(right < prices.length){
            if(prices[left] < prices[right]){
                int profit = prices[right] - prices[left];
                maxP = Math.max(maxP, profit);
            }
            else{
                left = right;
            }
            right++;                      
        }       
        return maxP;      
    }
}
