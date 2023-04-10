--------------------------------------------------- Array (Easy) -----------------------------------------------
  
Question Link :- https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/description/

--------------------------------------------------- Solution ----------------------------------------------------
  
class Solution {
    public int differenceOfSum(int[] nums) {
        int a = 0, b = 0;
        for (int x : nums) {
            a += x;
            for (; x > 0; x /= 10) {
                b += x % 10;
            }
        }
        return Math.abs(a - b);
    }
}
