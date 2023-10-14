Ques Link - https://leetcode.com/problems/combination-sum

------------------------------------------------ Solution ----------------------------------------------------

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0,ans,new ArrayList<>(),candidates,target);
        return ans;
    }
    public void solve(int ind,List<List<Integer>> ans,List<Integer> ls ,int[] arr,int target){
        if(target == 0){
            ans.add(new ArrayList(ls));
            return;
        }
        for(int i = ind ; i < arr.length ; i++){
            if(target < 0)
                return;
            ls.add(arr[i]);
            solve(i,ans,ls,arr,target-arr[i]);
            ls.remove(ls.size()-1);
        }
    }
}
