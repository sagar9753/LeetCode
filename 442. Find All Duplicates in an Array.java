Ques Link - https://leetcode.com/problems/find-all-duplicates-in-an-array

----------------------------------------------- Solution --------------------------------------------------

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            int j = Math.abs(nums[i]) - 1;
            if(nums[j] < 0)
                ans.add(j + 1);
            nums[j] = -nums[j];
        }
        return ans;
    }
}
