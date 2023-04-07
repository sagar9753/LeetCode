---------------------------------------------- Array(Easy) ------------------------------
  
Question Link :- https://leetcode.com/problems/find-pivot-index/description/

--------------------------------------------- Solution -----------------------------------
  
class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int []left=new int[n];
        int []right=new int[n];

        left[0]=nums[0];right[n-1]=nums[n-1];

        for(int i=1;i<n;i++)
        {
            left[i]=nums[i]+left[i-1];
            right[n-i-1]=nums[n-i-1]+right[n-i];
        }

        for(int i=0;i<n;i++){
            if(left[i]==right[i])
                return i;
        }

        return -1;
        
    }
}
