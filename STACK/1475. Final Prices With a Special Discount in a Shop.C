//next smaller element 
class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int len = prices.length;
        int[] res = new int[len];
        for(int i = 0; i < len; i++){
            while(!stack.empty() && prices[stack.peek()] >= prices[i]){
                res[stack.peek()] = prices[stack.peek()] - prices[i];
                stack.pop();
            }
            stack.push(i);
        }
        while(!stack.empty()){
            res[stack.peek()] = prices[stack.pop()];
        }
        return res;
        
    }
}
