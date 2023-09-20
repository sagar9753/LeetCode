Ques Link - https://leetcode.com/problems/subsets/

------------------------------------------- Solution ------------------------------------

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        solve(nums,0,ans,new ArrayList<>());
        return ans;
    }

    public void solve(int[] nums,int i,List<List<Integer>> ans,List<Integer> arr){
        if(i >= nums.length){
            ans.add(new ArrayList<>(arr));
            return;
        }
        solve(nums,i+1,ans,arr);
        arr.add(nums[i]);
        solve(nums,i+1,ans,arr);
        arr.remove(arr.size()-1);
    }
}
