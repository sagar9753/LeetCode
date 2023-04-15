----------------------------------------------- Array (Easy) -----------------------------------------------------------
 
Question link :- https://leetcode.com/problems/third-maximum-number/description/

---------------------------------------------- Solution --------------------------------------------------
  
class Solution {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE; 
        long max2 = Long.MIN_VALUE; 
        long max3 = Long.MIN_VALUE; 

        for(int n:nums){
            if(n>max1){
                max3=max2;
                max2=max1;
                max1=n;
            }
            else if(n>max2 && n<max1){
                max3=max2;
                max2=n;
            }
            else if(n>max3 && n<max2){
                max3=n;
            }
        }
        if(max3==Long.MIN_VALUE)
            return (int)max1;
        else
            return (int)max3;
    }
}
