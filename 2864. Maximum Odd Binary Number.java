Ques Link - https://leetcode.com/problems/maximum-odd-binary-numbe

-------------------------------------------- Solution ----------------------------------------

class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count0 = 0;
        int count1 = -1;
        StringBuilder ans = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == '0')
                count0++;
            else
                count1++;
        }
        while(count1-- > 0)
            ans.append('1');
        while(count0-- > 0)
            ans.append('0');
        ans.append('1');
        return ans.toString();
    }
}
