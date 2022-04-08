// sliding window
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals(" "))return 1;
        int left = 0, right = 0;
        boolean[] hash = new boolean[128];
        int maxLen = 0, tempLen = 0; 
        while(right < s.length()){
            char ch = s.charAt(right);
            if(hash[ch] == false){
                hash[ch] = true;
                right++;
                tempLen++;
            }
            else{
                char t = s.charAt(left);
                hash[t] = false;
                left++;
                tempLen--;                
            }
            if(tempLen > maxLen){
                maxLen = tempLen;
            }            
        }
        return maxLen;
    }
}
