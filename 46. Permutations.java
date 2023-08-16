Ques Link - https://leetcode.com/problems/permutations/description/

-------------------------------------- Solution -----------------------------------

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        findPermutation(ans,new ArrayList<>(),nums);
        return ans;
    }
    public void findPermutation(List<List<Integer>> ans,List<Integer> l , int[] nums){
        if(l.size() == nums.length){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(l.contains(nums[i]))
                continue;
            l.add(nums[i]);
            findPermutation(ans,l,nums);
            l.remove(l.size()-1);
        }
    }
}
