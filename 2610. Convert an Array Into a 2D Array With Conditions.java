Ques Link - https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/

---------------------------------------- Solution -----------------------------------------------

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] count = new int[nums.length+1];

        for(int n : nums){
            if(++count[n] > ans.size()){
                ans.add(new ArrayList<>());
                ans.get(ans.size()-1).add(n);
            }
            else
                ans.get(count[n]-1).add(n);
        }
        return ans;
    }
}
