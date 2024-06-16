Ques Link - https://leetcode.com/problems/count-pairs-that-form-a-complete-day-ii/

--------------------------------------- Solution ----------------------------------------------------

class Solution {
    public long countCompleteDayPairs(int[] hours) {
        Map<Integer, Integer> mp = new HashMap<>();
        long ans = 0;
        
        for(int hr : hours){
            int rem = hr % 24;
            int check = (24 - rem) % 24;
            
            ans += mp.getOrDefault(check, 0);
            
            mp.put(rem, mp.getOrDefault(rem, 0)+1);
        }
        return ans;
    }
}
