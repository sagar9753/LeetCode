Ques Link - https://leetcode.com/problems/count-items-matching-a-rule/

------------------------------------------- Solution ----------------------------------------------

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int c;

        if(ruleKey.equals("type"))
            c = 0;
        else if(ruleKey.equals("color"))
            c = 1;
        else
            c = 2;

        for(int i = 0; i < items.size() ; i++)
            if(items.get(i).get(c).equals(ruleValue))
                count++;
      
        return count;
    }
}
