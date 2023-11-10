Ques Link - https://leetcode.com/problems/combinations/description/

--------------------------------------- Solution -------------------------------------

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();

        solve(ans,n,k,new ArrayList<>(),1);
        return ans;
    }
    public void solve(List<List<Integer>> ans,int n,int k,List<Integer> arr,int i){
        if(arr.size() == k){
            ans.add(new ArrayList(arr));
            return;
        }
        for(; i <= n ; i++){
            arr.add(i);
            solve(ans,n,k,arr,i+1);
            arr.remove(arr.size()-1);
        }
    }
}
