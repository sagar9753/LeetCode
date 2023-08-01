Ques Link - https://leetcode.com/problems/create-target-array-in-the-given-order/description/

------------------------------------- Solution ----------------------------------

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int ans[] = new int [n];
        List <Integer> l = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
            l.add(index[i],nums[i]);

        for(int i=0;i<n;i++)
            ans[i]= l.get(i);
            
        return ans;
    }
}
