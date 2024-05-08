Ques Link - https://leetcode.com/problems/relative-ranks/

----------------------------------------------------- Solution - -------------------------------------

class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];
        List<Integer> ind = new ArrayList<>();
        
        for(int i = 0 ; i < score.length ; i++)
            ind.add(i);
        
        Collections.sort(ind, (a, b) -> score[b] - score[a]);

        for(int i = 0 ; i < score.length ; i++){
            if(i == 0)
                ans[ind.get(0)] = "Gold Medal";
            else if(i == 1)
                ans[ind.get(1)] = "Silver Medal";
            else if(i == 2)
                ans[ind.get(2)] = "Bronze Medal";
            else
                ans[ind.get(i)] = String.valueOf(i + 1); 
        }
        return ans;
    }
}
