-------------------------------------------- Array (Medium) ------------------------------------------------
  
 Question Link :- https://leetcode.com/problems/rotate-array/description/

-------------------------------------------- Solution ------------------------------------------------

class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k %= n;
        reverse(nums,0,n-1-k);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);    

    }
    private void reverse(int nums[],int s,int e){
        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;e--;
        }
    }
}
