Ques Link - https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/

------------------------------------------- Solution ---------------------------------------------------

class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            if(Integer.bitCount(i) == k){
                sum += nums.get(i);
            }
        }
        return sum;
    }
}
