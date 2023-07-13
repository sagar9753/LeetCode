Ques Link - https://leetcode.com/problems/arithmetic-subarrays/

-------------------------------------------------- Solution -----------------------------------------------

class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        for(int i = 0 ; i < l.length ; i++)
            ans.add(check(nums,l[i],r[i]));
        return ans;
    }
    public Boolean check(int[] num , int l ,int r){
        int[] ar = new int[r-l+1];
        for(int i = 0 ; i < ar.length ; i++)
            ar[i] = num[l++];

        Arrays.sort(ar);
        int diff = ar[1] - ar[0];
        for(int i = 2 ; i < ar.length ; i++)
            if(ar[i] - ar[i-1] != diff)
                return false;
        return true;
    }
}
