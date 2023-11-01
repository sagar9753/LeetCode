Ques Link - https://leetcode.com/problems/combination-sum-ii/

------------------------------ Solution ----------------------------------

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        solve(ans,new ArrayList<>(),candidates,target,0);
        return ans;
    }
    public void solve(List<List<Integer>> ans,List<Integer> ls,int[] arr,int tar,int ind){
        if(tar < 0)
            return;
        if(tar == 0){
            ans.add(new ArrayList(ls));
            return;
        }

        for(int i = ind ; i < arr.length ; i++){
            if(i > ind && arr[i] == arr[i-1])
                continue;
            ls.add(arr[i]);
            solve(ans,ls,arr,tar-arr[i],i+1);
            ls.remove(ls.size()-1);
        }
    }
}
