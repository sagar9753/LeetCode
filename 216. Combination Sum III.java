Ques Link - https://leetcode.com/problems/combination-sum-iii/

---------------------------------------- Solution ----------------------------------------------

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans,new ArrayList<>(),k,n,1);
        return ans;
    }
    public void solve(List<List<Integer>> ans, List<Integer> arr, int k, int n,int ind){
        if(arr.size() == k && n == 0){
            ans.add(new ArrayList(arr));
            return;
        }
        if(n < 0 || arr.size() == k)
            return;
        
        for(int i = ind ; i < 10 ; i++){
            arr.add(i);
            solve(ans, arr, k, n - i, i+1);
            arr.remove(arr.size()-1);
        }
    }
}
