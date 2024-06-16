Ques Link - https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/

---------------------------------- Solution ---------------------------------------------

class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int ans = 0;
        
        for(int i = 0 ; i < hours.length; i++){
            for(int j = i+1 ; j < hours.length ; j++){
                int sum = hours[i] + hours[j];
                if(sum % 24 == 0)
                    ans++;
            }
        }
        return ans;
    }
}
