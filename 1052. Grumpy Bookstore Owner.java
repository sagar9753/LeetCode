Ques Link - https://leetcode.com/problems/grumpy-bookstore-owner

---------------------------------- Solution -------------------------------------------

class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum = 0, ans = 0, max = 0;
        
        for(int i = 0, j = 0 ; i < grumpy.length ; i++){
            if(grumpy[i] == 1)
                sum += customers[i];
            else
                ans += customers[i];

            if((i-j) >= minutes){
                if(grumpy[j] == 1)
                    sum -= customers[j];
                j++;
            }
            max = Math.max(max, sum);
        }
        return ans + max;
    }
}
