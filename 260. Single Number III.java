Ques Link - https://leetcode.com/problems/single-number-iii/

---------------------------------- Solution ------------------------------------

class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0, count = 0;
        int[] ans = new int[2];

        for(int num : nums)
            xor = xor ^ num;
        
        while(xor % 2 == 0){
            xor = xor >> 1;
            count++;
        }
        xor = 1 << count;

        for(int num : nums){
            if((num & xor) == 0)
                ans[0] = ans[0] ^ num;
            else
                ans[1] = ans[1] ^ num;
        }
        return ans;
    }
}
