Ques Link - https://leetcode.com/problems/k-items-with-the-maximum-sum/description/

-------------------------------------- Solution ------------------------------------

class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(numOnes > k)
            return k;
        else if((numOnes + numZeros) >= k)
            return numOnes;
        else{
            int ele = k - (numOnes + numZeros);
            return numOnes - ele;
        }
        
    }
}
