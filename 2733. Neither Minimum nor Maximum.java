Ques link - https://leetcode.com/problems/neither-minimum-nor-maximum

---------------------------------------- Solution --------------------------------------

class Solution {
  public int findNonMinOrMax(int[] nums) {
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      for(int n : nums){
          max = Math.max(max,n);
          min = Math.min(min,n);
      }
      for(int n : nums)
        if(n != max && n != min)
            return n;
    
      return -1;
  }
}
