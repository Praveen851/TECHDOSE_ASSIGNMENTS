class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int m1 = 0, m2 = 0, c1 = 0, c2 = 0, l = nums.length;
        for(int i = 0; i < l; i++){
            if(m1 != 0 && m1 == nums[i])c1++;
            else if(m2 != 0 && m2 == nums[i])c2++;
            else if(m1 == 0){
                m1 = nums[i];
                c1++;
            }
            else if(m2 == 0){
                m2 = nums[i];
                c2++;
            }
            else{
                c1--;
                c2--;
                if(c1 == 0)m1 = 0;
                if(c2 == 0)m2 = 0;
            }            
        }
        List<Integer> list = new ArrayList<Integer>();
        c1 = 0;
        c2 = 0;
        for(int n : nums){
            if(n == m1)c1++;
            else if(n == m2)c2++;
        }
        if(c1 > l/3)list.add(m1);
        if(c2 > l/3)list.add(m2);
        return list;
    }
}
