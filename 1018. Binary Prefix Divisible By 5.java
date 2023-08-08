Ques Link - https://leetcode.com/problems/binary-prefix-divisible-by-5/submissions/1015589080/

----------------------------------- Solution --------------------------------------

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int prev = 0 ;
        List<Boolean> ans = new ArrayList<>();
        for(int num : nums){
            prev = (prev << 1 | num) % 5;
            ans.add(prev==0);
        }
        return ans;
    }
}
