Ques Link - https://leetcode.com/problems/two-sum/description/

------------------------------------- Solution ------------------------------------------------

class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> check = new ArrayList<>();
        int n = nums.length;

        for(int i = 0 ; i < n ; i++)
            check.add(nums[i]);
        
        for(int i = 0 ; i < n ; i++){
            int diff = target - nums[i];

            if(check.contains(diff) && check.indexOf(diff) != i)
                return new int[]{i,check.indexOf(diff)};

        }
        return new int[]{};
    }
}
