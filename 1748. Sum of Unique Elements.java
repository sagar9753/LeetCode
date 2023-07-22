Ques Link - https://leetcode.com/problems/sum-of-unique-elements/description/

------------------------------------------- Solution ---------------------------------------------

class Solution {
    public int sumOfUnique(int[] nums) {
        int[] count = new int[101];
        int sum = 0;
        for(int i = 0; i < nums.length ; i++){
            if(count[nums[i]] == 0){
                sum += nums[i];
                count[nums[i]] = 1;
                continue;
            }
            if(count[nums[i]] == 1){
                sum -= nums[i];
                count[nums[i]] = -1;
            }
        }
        return sum;
    }
}
