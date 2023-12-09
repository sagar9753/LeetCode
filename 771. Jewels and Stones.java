Ques Link - https://leetcode.com/problems/jewels-and-stones/

------------------------------------- Solution --------------------------------------

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] arr = new int[123];
        int ans = 0 ; 
        for(char c : stones.toCharArray()){
            arr[c]++;
        }
        for(char c : jewels.toCharArray()){
            ans += arr[c];
        }
        return ans;
    }
}
